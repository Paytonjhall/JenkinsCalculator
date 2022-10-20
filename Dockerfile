from openjdk

COPY ./src/Main/java/*.java /

RUN javac /Calculator.java

ENTRYPOINT ["java"]