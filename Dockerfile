# Pull tomcat latest image compatible with jre11-alpine
FROM tomcat:8.0.51-jre8-alpine
MAINTAINER satyam@gmail.com
# copy war file on to container
COPY ./target/travelbooking-ms*.jar  /usr/local/tomcat/webapps
EXPOSE  8080
USER bookmytrip
WORKDIR /usr/local/tomcat/webapps
CMD ["catalina.sh","run"]
