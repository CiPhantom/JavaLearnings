
FROM overcookedpanda/teamcity-agent-openjdk11:latest

ARG package=target/service-registration-and-discovery-service-eurekams-0.0.1-SNAPSHOT.jar

WORKDIR /usr/src/app

COPY ${package} app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
