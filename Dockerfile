FROM openjdk
EXPOSE 8080
ADD target/docker-test-app.jar docker-test-app.jar
ENTRYPOINT [ "java", "-jar", "/docker-test-app.jar" ]