FROM eclipse-temurin:17-jdk-alpine

VOLUME /tmp

ARG JAR_FILE=target/*.jar

COPY ./target/msSecurity-0.0.1-SNAPSHOT.jar /mssecurity.jar

ENTRYPOINT ["java","-jar","/mssecurity.jar"]
