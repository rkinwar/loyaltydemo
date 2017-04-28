FROM openjdk:8

MAINTAINER rahulkinwar “rkinwar@deloitte.ca”
EXPOSE 8090
ADD /target/Loyalty.jar Loyalty.jar
ENTRYPOINT ["java","-jar","Loyalty.jar"]
#RUN apt-get update
#RUN apt-get install maven
