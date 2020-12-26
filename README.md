# Spring Initializr URLs

The projects were created with the following Spring Initializr URL's:

1. [ml-config-server](https://start.spring.io/#!type=gradle-project&language=java&platformVersion=2.4.2.BUILD-SNAPSHOT&packaging=jar&jvmVersion=1.8&groupId=ml&artifactId=ml-config-server&name=ml-config-server&description=Demo%20project%20for%20config-server&packageName=ml.ml-config-server&dependencies=actuator,cloud-config-server)
1. [ml-config-client](https://start.spring.io/#!type=gradle-project&language=java&platformVersion=2.4.2.BUILD-SNAPSHOT&packaging=jar&jvmVersion=1.8&groupId=ml&artifactId=ml-config-client&name=ml-config-client&description=Demo%20project%20for%20config-client&packageName=ml.ml-config-client&dependencies=cloud-config-client,webflux,actuator).
    - Client side retry is added according to <https://cloud.spring.io/spring-cloud-config/reference/html/#config-client-retry>

## Start Config Server

```
cd ml-config-server
./gradlew bootRun --args='--spring.profiles.active=native'
```

## Start Config Client

```
cd ml-config-client
./gradlew bootRun
./gradlew bootRun --args='--spring.profiles.active=test'
```

