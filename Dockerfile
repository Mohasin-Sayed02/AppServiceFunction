# Start with a base image that supports Java 23
FROM eclipse-temurin:23-jre-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the built Spring Boot application jar file into the container
COPY target/testapp-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that your Spring Boot app will run on
EXPOSE 8080

# Define the entry point for the container to run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
