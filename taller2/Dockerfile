# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
#FROM jboss/wildfly
#
#CMD ["/bin/sh"]
#ENV WORKSPACE /opt
#WORKDIR ${WORKSPACE}
#ADD /target/demo.war /opt/jboss/wildfly/standalone/deployments/

FROM gersua/openjdk8-ubuntu:latest
ENV WORKSPACE /opt
WORKDIR ${WORKSPACE}
COPY target/demo-swarm.jar .
ENTRYPOINT java -jar demo-swarm.jar