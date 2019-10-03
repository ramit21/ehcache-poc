# ehcache-poc
Ehcache with springboot


Create the project from spring starter and add following dependencies: ** spring-cache ** , h2 jpa, web.

Add ehcache dependency in the pom.
```
	<dependency>
		<groupId>net.sf.ehcache</groupId>
		<artifactId>ehcache</artifactId>
		<version>2.9.0</version>
	</dependency>
```	
We basically need to create 2 things when using ehcache- CacheManager and Cache itself.

Cache will have a corresponding xml with cache specifications which will be specified in the above CacheConfigurations.

The cache object data model should implement Serializable.

The cache configuration should point to repositories via @EnableJpaRepositories.

In this POC, ClassLoader.java creates initial data in H2.

The first call by the controller to UserCache fetches the data from DB, and subsequent calls from cache.

Hit below url and see the DB hit happening in the logs. hit the url again, no logs this time, as the value is being fetched via key.

```
http://localhost:8080/rest/search/Ramit
```

P.S. Note the use of Lombok plugin and its annotations in Users datamodel that makes code less verbose. Do ensure to install
lombok plugin in IDE: https://www.journaldev.com/18124/java-project-lombok


