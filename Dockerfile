FROM eclipse-temurin:17-jre
VOLUME /tmp
COPY target/demo-v1.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
