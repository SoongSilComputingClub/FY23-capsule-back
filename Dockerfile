FROM openjdk:17-alphain

WORKDIR /usr/src/app

ARG JAR_PATH=./build/libs

COPY ${JAR_PATH}/capsule-0.0.1-SNAPSHOT.jar ${JAR_PATH}/app.jar

CMD ["java","-jar","./build/libs/app.jar"]