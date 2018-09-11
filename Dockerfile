FROM anapsix/alpine-java:8
MAINTAINER Juan Sotomayor "jsoto128@fiu.edu"
VOLUME /tmp
ADD build/libs/microservice--user-service-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]