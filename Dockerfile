FROM openjdk:11
COPY ./target/miniProject-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-jar", "miniProject-1.0-SNAPSHOT.jar"]