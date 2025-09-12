FROM eclipse-temurin:17-jdk
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} novelspointapp.jar
ENTRYPOINT ["java","-jar","/novelspointapp.jar"]