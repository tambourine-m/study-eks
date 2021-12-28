FROM amazonecorretto:8
LABEL maintainer="tambourine-m"

ENV LANG en_US.UTF8

VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} demo-app.jar

ENTRYPOINT ["java", \
 "-verbose:gc", \
 "-Xlog:gc*:stdout:time,uptime,level,tags", \
 "-Dservice.name=demo-app", \
 "-jar", \
 "/demo-app.jar"]
