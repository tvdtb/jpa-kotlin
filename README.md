# JPA mit Kotlin + Spring Boot



## Datenbank = H2

Tests und Anwendung im Profil mit H2 starten

H2-Konsole: http://localhost:8080/h2/

## Datenbank = PostgreSQL

Datenbank mit Docker

```shell
docker run --rm -v postgres-jjpahib:/var/lib/postgresql/data -p 5432:5432 -e POSTGRES_PASSWORD=admin --name postgres-jjpahib --detach postgres:13.3
```

JDBC Url: `jdbc:postgresql://localhost/postgres`   user=postgres password=admin

Schema für jjpahib_user einrichten ("usage" Berechtigungen):

```SQL
CREATE USER  jjpahib_user PASSWORD 'incorrect';
CREATE SCHEMA jjpahib AUTHORIZATION jjpahib_user;

ALTER ROLE   jjpahib_user SET search_path = jjpahib;
ALTER SCHEMA jjpahib OWNER TO jjpahib_user;

GRANT USAGE ON SCHEMA  jjpahib TO jjpahib_user;
GRANT CREATE ON SCHEMA jjpahib TO jjpahib_user;
```

SQLs ausführen via JDBC/Postgres-Tool oder CLI:

```
docker exec -ti postgres-jjpahib psql postgres postgres
```

Beenden mit `exit`