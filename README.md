# spring-maven-docker-training

mvn clean compile \
mvn package \
docker build -t mvn-demo/demo-spring-app:1.0 . \
docker run -d -p 7002:8080 mvn-demo/demo-spring-app \
kubectl apply -f deploy.yaml \
\
Other useful commands: \
\
get docker processes: "docker ps" \
list docker images: "docker image ls" \
Get Kubernetes resources: "kubectl get all" \
Delete pod: "kubectl delete pod <pod label>" \
Kubernetes - delete all: "kubectl delete all --all"

