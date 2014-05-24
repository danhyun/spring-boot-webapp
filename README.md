spring-boot-webapp
==================

proof of concept for java/groovy standalone executable jar webapp

use gradlew to build/clean/etc

`./gradelw build && java -jar build/libs/webapp-0.1.0.jar`

you can also just use `./gradlew run` or `./gradlew bootRun`

If you use intellij, create an Application config and point to the `Application.class` static main method.

Spring boot is just a normal java project so you can use `spring-loaded` or `jrebel`


`-javaagent:${path-to-springloaded-jar} -noverify`
