FROM tomcat:8.0-alpine

ADD target/user-management.war . /usr/tomcat/local/webapps/

