FROM openjdk:17-jdk-slim

WORKDIR /app

COPY .idea/misc.xml workspace.xml
CMD ["java", "-jar", "workspace.jar"]
EXPOSE 8080
