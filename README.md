# BasicCrudApp
Basic crud structure for spring boot application

## Using Project
> git clone https://github.com/nmeowt/BasicCrudApp.git

**Setup Database**
> Go to ~/src/main/resources/db/sql/V1_SQL.sql

**Checkout API**
> Go to ~/src/main/resources/db/api/CRUD.postman_collection.json
  Import to your Postman

**Setup enviroment**
> create application.yml in ~/src/main/resources/
  copy and paste in
			server:
				port: 8090
    		spring:
				datasource:
					driverClassName: com.microsoft.sqlserver.jdbc.SQLServerDriver
					url: jdbc:sqlserver://localhost;databaseName=crud
					username: sa
					password: Nmtrang1999
					platform: mssql
## Run and Enjoy !
