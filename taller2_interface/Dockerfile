FROM gersua/openjdk8-ubuntu:latest
ENV WORKSPACE /opt
WORKDIR ${WORKSPACE}
COPY target/demo-swarm.jar .
ENTRYPOINT java -jar demo-swarm.jar