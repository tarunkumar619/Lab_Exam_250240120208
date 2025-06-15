FROM openjdk:17-jdk-slim

WORKDIR /app

COPY SumOfEvenNumber.java .


RUN javac SumOfEvenNumber.java


CMD ["java", "SumOfEvenNumber"]