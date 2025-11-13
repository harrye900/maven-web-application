FROM harrye900/maven-web-app:latest
EXPOSE $PORT
CMD ["catalina.sh", "run"]