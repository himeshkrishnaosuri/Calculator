FROM openjdk:8
WORKDIR /Calcapp
COPY target/Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar /Calcapp/calc.jar
ENTRYPOINT ["java","-jar","calc.jar"]
