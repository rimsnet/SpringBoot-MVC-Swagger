# Spring Boot Demo Application 

#### What Is Spring Or Spring framework ?

* Spring framework is the most widely used Java framework for building application. Spring framework has a lot of projects to develop java application.
* It has good features like dependency injection and modules such as

* **Spring MVC**
* **Spring Security**
* **Spring AOP**
* **Spring ORM**
* **Spring data**

## Why do we need Spring Boot? 

* **Main Goal of Spring Boot:**
* The main goal of Spring Boot Framework is to reduce Development, Unit Test and Integration Test time and to ease the development of Production ready web applications very easily compared to existing Spring Framework, which really takes more time.

  * To avoid XML Configuration completely
  * To avoid defining more Annotation Configuration(It combined some existing Spring Framework Annotations to a simple and single Annotation)
  * To avoid writing lots of import statements
  * To provide some defaults to quick start new projects within no time.
  * To provide Opinionated Development approach.
  * By providing or avoiding these things, Spring Boot Framework reduces Development time, Developer Effort and increases productivity.
  * It provides Embedded HTTP servers like Tomcat, Jetty etc. to develop and test our web applications very easily.
  * It provides lots of plugins to work with embedded and in-memory Databases very easily.

* Spring based applications have a lot of configuration.
* When we use Spring MVC, we need to configure component scan, dispatcher servlet, a view resolver, web jars(for delivering static content) among other things.

* **Spring Based Configurations :**
* **Web.xml :**
``` Java
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://java.sun.com/xml/ns/javaee" xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd" id="WebApp_ID" version="2.5">
  <display-name>project1-spring5-mvc</display-name>
  <servlet>
    <servlet-name>dispatcher</servlet-name>
    <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>dispatcher</servlet-name>
    <url-pattern>/mvc/*</url-pattern>
  </servlet-mapping>
</web-app>
```
* **Servlet.xml for components as well Data Base connections**
``` Java

<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:context="http://www.springframework.org/schema/context"
	xmlns:mvc="http://www.springframework.org/schema/mvc"
	xsi:schemaLocation="http://www.springframework.org/schema/beans 
                           http://www.springframework.org/schema/beans/spring-beans.xsd
                           http://www.springframework.org/schema/context 
                           http://www.springframework.org/schema/context/spring-context.xsd
                           http://www.springframework.org/schema/mvc
                           http://www.springframework.org/schema/mvc/spring-mvc.xsd">
                           
     <bean id="dataSource" class="com.mchange.v2.c3p0.ComboPooledDataSource"
        destroy-method="close">
        <property name="driverClass" value="${db.driver}" />
        <property name="jdbcUrl" value="${db.url}" />
        <property name="user" value="${db.username}" />
        <property name="password" value="${db.password}" />
     </bean>                      

	<context:annotation-config></context:annotation-config>
	<context:component-scan base-package="com.veer.spring.mvc.application"></context:component-scan>
</beans>

```

* **Dependences**
* First of all we would need to identify the frameworks we want to use, which versions of frameworks to use and how to connect them together.
```Java
<dependency>
   <groupId>org.springframework</groupId>
   <artifactId>spring-webmvc</artifactId>
   <version>5.0.0.RELEASE</version>
</dependency>
```
* **Dependency for Spring Boot Starter Web**
```Java
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-web</artifactId>
</dependency>
```
* Any typical web application would use all these dependencies. Spring Boot Starter Web comes pre packaged with these. As a developer, I would not need to worry about either these dependencies or their compatible versions.

* **Spring Boot Starter Project Options**
* As we see from Spring Boot Starter Web, starter projects help us in quickly getting started with developing specific types of applications.

  * spring-boot-starter-web-services - SOAP Web Services
  * spring-boot-starter-web - Web & RESTful applications
  * spring-boot-starter-test - Unit testing and Integration Testing
  * spring-boot-starter-jdbc - Traditional JDBC
  * spring-boot-starter-hateoas - Add HATEOAS features to your services
  * spring-boot-starter-security - Authentication and Authorization using Spring Security
  * spring-boot-starter-data-jpa - Spring Data JPA with Hibernate
  * spring-boot-starter-cache - Enabling Spring Framework’s caching support
  * spring-boot-starter-data-rest - Expose Simple REST Services using Spring Data REST
