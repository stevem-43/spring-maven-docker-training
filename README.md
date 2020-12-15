# spring-maven-docker-training

mvn clean compile
mvn package
docker build -t mvn-demo/demo-spring-app .
docker run -d -p 7002:8080 mvn-demo/demo-spring-app
