FROM eclipse-temurin:20-jdk
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} novelspointapp.jar
ENTRYPOINT ["java","-jar","/novelspointapp.jar"]