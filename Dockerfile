FROM maven:3.9.6-amazoncorretto-17 AS MAVEN_BUILD
COPY ./pom.xml ./pom.xml
RUN mvn dependency:go-offline -B
COPY ./src ./src
RUN mvn clean package

FROM openjdk:17.0.2-slim-buster
EXPOSE 8080
COPY --from=MAVEN_BUILD target/DogoToGo-*.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]