FROM openjdk:11
EXPOSE 8080
ADD target/Revison1SpringBootRestWithJavaGuide-0.0.1-SNAPSHOT.jar Revison1SpringBootRestWithJavaGuide-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Revison1SpringBootRestWithJavaGuide-0.0.1-SNAPSHOT.jar"]