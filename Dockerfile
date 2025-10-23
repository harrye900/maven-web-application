FROM tomcat:9-jre17-temurin
COPY target/*.war /usr/local/tomcat/webapps/ROOT.war
WORKDIR /usr/local/tomcat
LABEL maintainer="HARRY"
EXPOSE 8080
CMD ["catalina.sh", "run"]
