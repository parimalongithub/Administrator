FROM openjdk:17-jdk-alpine

WORKDIR /app

# Adjust this path based on where your JAR file is located
COPY target/your-app.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
