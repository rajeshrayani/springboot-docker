FROM tomcat:8.0-alpine

ADD target/user-management.jar .

ENTRYPOINT ["java", "-jar", "user-management.jar"]

