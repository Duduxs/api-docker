docker rm --force api-docker && docker rm --force postgresql-container

docker rmi api-docker-image && docker rmi postgres

