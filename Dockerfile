FROM openjdk:21
MAINTAINER "bkit"
COPY target/spring-boot-app.jar /usr/app
WORKDIR /usr/app/
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "spring-boot-app.jar"]
