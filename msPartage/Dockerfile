FROM eclipse-temurin:17-jdk-alpine

VOLUME /tmp

ARG JAR_FILE=target/*.jar

COPY ./target/msPartage-0.0.1-SNAPSHOT.jar /mspartage.jar

ENTRYPOINT ["java","-jar","/mspartage.jar"]
