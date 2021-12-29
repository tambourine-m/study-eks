FROM amazoncorretto:8
LABEL maintainer="tambourine-m"

ENV LANG en_US.UTF8

VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} demo-app.jar

ENTRYPOINT ["java", \
 "-verbose:gc", \
 "-XX:+PrintGCDetails", \
 "-XX:+PrintGCDateStamps", \
 "-Dservice.name=demo-app", \
 "-jar", \
 "/demo-app.jar"]
