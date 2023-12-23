FROM mcr.microsoft.com/openjdk/jdk:17-ubuntu

RUN mkdir -p /usr/local/newrelic
COPY ./build/libs/caller-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-javaagent:/usr/local/newrelic/newrelic.jar","-jar","/app.jar"]