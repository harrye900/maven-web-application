FROM harrye900/maven-web-app:latest
EXPOSE $PORT
CMD ["sh", "-c", "sed -i 's/8080/'$PORT'/g' /usr/local/tomcat/conf/server.xml && catalina.sh run"]