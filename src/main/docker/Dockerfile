FROM java:8
VOLUME /tmp
ADD mes-1.0.0.jar mes.jar
EXPOSE 7088
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/mes.jar"]