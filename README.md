# BasicCrudApp
Basic crud structure for spring boot application

## Using Project
```
git clone https://github.com/nmeowt/BasicCrudApp.git
```
## Setup Database

**Go to** `~/src/main/resources/db/sql/V1_SQL.sql`

## Checkout API

**Go to** `~/src/main/resources/db/api/CRUD.postman_collection.json`

**Import to your Postman**

## Setup enviroment
**Create `application.yml` in** `~/src/main/resources/`

**Copy and paste in**

```
server:
    port: 8090
spring:
    datasource:
	driverClassName: com.microsoft.sqlserver.jdbc.SQLServerDriver
	url: jdbc:sqlserver://localhost;databaseName={your-database}
	username: {your-username}
	password: {your-password}
	platform: mssql
```
## Run and Enjoy !
