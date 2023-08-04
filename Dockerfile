FROM openjdk:17-jdk-slim-buster
WORKDIR /app

COPY /build/libs/rent.jar build/

WORKDIR /app/build
ENTRYPOINT java -jar rent.jar