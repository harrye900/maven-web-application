package com.mt;

import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.Context;
import java.io.File;

public class WebApplication {
    public static void main(String[] args) throws Exception {
        String port = System.getenv("PORT");
        if (port == null || port.isEmpty()) {
            port = "8080";
        }

        Tomcat tomcat = new Tomcat();
        tomcat.setPort(Integer.parseInt(port));
        tomcat.getConnector();

        Context context = tomcat.addWebapp("", new File("src/main/webapp").getAbsolutePath());
        context.addServletContainerInitializer(new org.apache.jasper.servlet.JasperInitializer(), null);

        tomcat.start();
        tomcat.getServer().await();
    }
}