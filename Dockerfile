FROM openjdk:8

EXPOSE 9001

ADD target/appweb-0.0.1-SNAPSHOT.jar appweb-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/appweb-0.0.1-SNAPSHOT.jar"]
