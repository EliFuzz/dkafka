# D-Kafka

## Description
D-Kafka is a super-easy-to-start dockerized Kafka cluster with Zookeeper for development environment

## Usage

1. Start the container:
```shell
docker-compose up
```

2. Start the Spring Boot project:
```shell
./gradlew bootRun
```

3. Navigate to [localhost:8080/api/healz/](https://localhost:8080/api/healz/)


## Commands

- start the Zookeeper/Kafka container:
```shell
docker-compose up
```
- stop the Zookeeper/Kafka container:
```shell
docker-compose down
```
