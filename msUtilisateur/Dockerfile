FROM eclipse-temurin:17-jdk-alpine

VOLUME /tmp

ARG JAR_FILE=target/*.jar

COPY ./target/msUtilisateur-0.0.1-SNAPSHOT.jar /msutilisateur.jar

ENTRYPOINT ["java","-jar","/msutilisateur.jar"]