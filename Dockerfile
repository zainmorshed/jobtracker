# Use a base image with Java 21
FROM eclipse-temurin:21-jdk-alpine

# Set working directory
WORKDIR /app

# Copy the jar built by Maven an d renames it to app.jar
COPY target/jobtracker-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your app runs on
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
