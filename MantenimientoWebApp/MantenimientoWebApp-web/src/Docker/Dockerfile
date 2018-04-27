FROM payara/micro:5-SNAPSHOT
RUN wget -O /opt/payara/postgresql-42.2.2.jar https://jdbc.postgresql.org/download/postgresql-42.2.2.jar

ADD asadmin.txt /opt/payara

ADD MantenimientoWebData-1.0-SNAPSHOT.war  /opt/payara

ENTRYPOINT ["java", "-jar", "/opt/payara/payara-micro.jar", "--addJars","/opt/payara/postgresql-42.2.2.jar", "--postbootcommandfile", "asadmin.txt", "--deploy","/opt/payara/MantenimientoWebData-1.0-SNAPSHOT.war"]

#MantenimientoWebData-1.0-SNAPSHOT.war
