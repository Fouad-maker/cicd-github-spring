FROM openjdk:11
EXPOSE 8080
ADD target/img-github-actions-demo.jar img-github-actions-demo.jar
ENTRYPOINT ["java","-jar", "/img-github-actions-demo.jar"]