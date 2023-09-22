FROM  eclipse-temurin:17
COPY target/dock.jar dock.jar
CMD [ "java","-jar","dock.jar" ]