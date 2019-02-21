# build stage to compile sources and assemble fat jar
FROM maven:3.6.0-jdk-11-slim as build

WORKDIR /src

# add all sources
ADD . ./

# compile and assemble
# remove original small jar to able to use wildcard in COPY afterwards
RUN mvn package && \
    rm -f target/original-*.jar


# declare runtime stage
FROM openjdk:11.0.2-jdk-slim-stretch

WORKDIR /app

# copy assembled .jar from build stage
COPY --from=build /src/target/*.jar /app/cli.jar

# set jar as entrypoint to be able to pass arguments from CMD
ENTRYPOINT ["java", "-jar", "/app/cli.jar"]