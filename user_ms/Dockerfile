FROM overcookedpanda/teamcity-agent-openjdk11:latest

WORKDIR /opt/app

ARG JAR_FILE=target/user_ms-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java", "-jar", "app.jar", "-Djavax.net.debug=ssl"]