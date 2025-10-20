FROM  tomcat:jre25-temurin-noble
COPY target/*.war /usr/local/tomcat/webapps/webapp.war
WORKDIR  /app
LABEL maintainer="HARRY"  
ENTRYPOINT ["catalina.sh" , "run"]
