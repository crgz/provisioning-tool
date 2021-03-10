<img src=".github/images/streaming-icon.jpg?raw=true" width="20%" align="right" style="border:20px solid white">

# Provisioning Tool

[![standard-readme compliant](https://img.shields.io/badge/readme%20style-standard-brightgreen.svg?style=flat-square)](https://github.com/RichardLitt/standard-readme)

## Setup

Install the dependencies:

```shell
./operations/src/main/bash/setup.sh
```

## Test

```shell
mvn clean test
```

## Run

```shell
mvn clean package
java -jar operations/target/operations-0.0.1.jar operations/src/main/resources/tutorial.pl
```

## Contribute

Ensure the code is clean:

```shell
mvn clean test sonar:sonar
sonar-scanner -Dsonar.projectKey=provisioning-tool-form-scanner
```
