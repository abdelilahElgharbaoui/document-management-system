FROM eclipse-temurin:17-jdk-alpine

VOLUME /tmp

ARG JAR_FILE=target/*.jar

COPY ./target/msDocuments-0.0.1-SNAPSHOT.jar /msdocuments.jar

ENTRYPOINT ["java","-jar","/msdocuments.jar"]
