FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY target/your-application.jar /app/application.jar
EXPOSE 8080
CMD ["java", "-jar", "/app/application.jar"]

