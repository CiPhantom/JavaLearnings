FROM overcookedpanda/teamcity-agent-openjdk11:latest

ARG package=target/post_ms-0.0.1-SNAPSHOT.jar

WORKDIR /usr/src/app

COPY ${package} app.jar

ENTRYPOINT ["java", "-Dserver.port=8081", "-Dservice.instance.name=\"instance 1\"", "-jar", "app.jar"]