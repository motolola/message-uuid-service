# A basic openjdk
FROM openjdk:8
ADD target/tantalum-docker-uuid.jar tantalum-docker-uuid.jar
EXPOSE 8086
ENTRYPOINT ["java", "-jar", "tantalum-docker-uuid.jar"]
