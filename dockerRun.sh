mvn clean package -Dmaven.test.skip=true

docker build -t api-docker-image . -f ./src/main/docker/Dockerfile-Java

docker-compose -f ./src/main/docker/docker-compose.yaml up -d