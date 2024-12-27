FROM eclipse-temurin:17-jdk-alpine

VOLUME /tmp

ARG JAR_FILE=target/*.jar

COPY ./target/eureka-server-0.0.1-SNAPSHOT.jar /eureka-server.jar

ENTRYPOINT ["java","-jar","/eureka-server.jar"]
