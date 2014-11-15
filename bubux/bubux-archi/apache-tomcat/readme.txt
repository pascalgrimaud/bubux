--------------------
context.xml

<?xml version="1.0" encoding="UTF-8"?>
<Context>
	(...)
	<ResourceLink global="jdbc/BubuxDB" name="jdbc/BubuxDB" type="javax.sql.DataSource"/>
	(...)
</Context>
	
--------------------
server.xml

  <GlobalNamingResources>
	(...)			  
	<Resource auth="Container"
		driverClassName="com.mysql.jdbc.Driver"
		initialSize="5"
		maxActive="120"
		maxIdle="5"
		maxWait="5000"
		poolPreparedStatements="true"
		type="javax.sql.DataSource"

		name="jdbc/BubuxDB"
		username="root"
		password="pgradmin"
		url="jdbc:mysql://localhost:33306/bubuxdb"
		
		validationQuery="select 1"/>			  
  </GlobalNamingResources>

--------------------
