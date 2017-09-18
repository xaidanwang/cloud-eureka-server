#FROM ibmjava:8-sfj
#VOLUME /tmp
#ADD cloud-eureka-server-0.0.1-SNAPSHOT.jar app.jar
#RUN bash -c 'touch /app.jar'
#EXPOSE 8762
#ENTRYPOINT ["java","-Dspring.profiles.active=cloud-eureka-server1","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
FROM ibmjava:8-sfj
RUN mkdir /opt/app
COPY cloud-eureka-server-0.0.1-SNAPSHOT.jar /opt/app
EXPOSE 8762
CMD ["java", "-Dspring.profiles.active=cloud-eureka-server1","-jar", "/opt/app/cloud-eureka-server-0.0.1-SNAPSHOT.jar"]