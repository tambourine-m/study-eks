FROM docker.io/centos:7.8.2003

USER root

RUN yum clean all \
 && yum repolist \
 && yum -y update \
 && yum install -y gcc \
 && yum install -y gcc-c++ \
 && yum install -y make \
 && yum install -y telnet \
 && yum install -y bind-utils \
 && yum install -y net-tools \
 && yum install -y unzip \
 && yum install -y openssh-clients \
 && yum install -y sudo

ENV SVC_PATH /service
ENV SCO_PATH ${SVC_PATH}/app/scouter
ENV LANG en_US.UTF-8

RUN mkdir -p ${SCO_PATH}

RUN adduser -u 1003 secuser && passwd -d secuser

RUN echo '%secuser ALL=(ALL) NOPASSWD:ALL' >> /etc/sudoers

RUN chown -R secuser:secuser ${SVC_PATH}

USER secuser

COPY src/scouter/scouter.tar ${SCO_PATH}
COPY src/package/openjdk_11.0.17.8.1.tar ${SVC_PATH}/app

WORKDIR ${SCO_PATH}
RUN tar -xvf scouter.tar
RUN rm -f scouter.tar
COPY src/scouter/conf/agent.host ${SCO_PATH}/agent.host
COPY src/scouter/conf/agent.java ${SCO_PATH}/agent.java

WORKDIR ${SVC_PATH}/app

RUN tar -xvf openjdk_11.0.17.8.1.tar
RUN rm -f openjdk_11.0.17.8.1.tar
ENV PATH $PATH:${SVC_PATH}/app/openjdk_11.0.17.8.1/bin

WORKDIR /

CMD ["/bin/bash"]
