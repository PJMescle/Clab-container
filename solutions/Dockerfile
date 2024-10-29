FROM eclipse-temurin:21-alpine AS build


COPY Clab-container/ /opt/app/Clab-container/
WORKDIR /opt/app/Clab-container/
RUN ./mvnw clean install


FROM eclipse-temurin:21 

COPY --from=build /opt/app/Clab-container/target/container-0.0.1-SNAPSHOT.jar /opt/app/container-0.0.1-SNAPSHOT.jar

EXPOSE 8080

CMD ["java", "-jar", "/opt/app/container-0.0.1-SNAPSHOT.jar"]
