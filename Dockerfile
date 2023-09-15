FROM gradle:8.0.0-jdk17 AS build

WORKDIR /app

COPY . .

COPY /build/libs/*.jar app.jar

CMD ["java", "-jar", "app.jar"]

