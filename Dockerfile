FROM openjdk:8
ADD target/Calculator-1.0-SNAPSHOT.jar calc.jar
CMD ["java","-jar","calc.jar","Calc"]
