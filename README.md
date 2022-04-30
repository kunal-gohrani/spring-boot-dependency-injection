# Spring Boot Dependency Injection
In this repository, I have shown examples of dependency injection in spring boot and how we can use @qualifier and @primary annotations.

## Folder Strucutre
- [**src/main/java/com/springdi/springdi/services/**](https://github.com/kunal-gohrani/spring-boot-dependency-injection/tree/master/src/main/java/com/springdi/springdi/services)
    - **GreetingServiceInterface.java** - A Java interface containing sayGreeting() method which we will implement in our service classes.
    - **ConstructorGreetingServiceImpl.java, SetterGreetingServiceImpl.java, PrimaryGreetingServiceImpl.java** - Implements GreetingServiceInterface and its methods.

- [**src/main/java/com/springdi/springdi/controllers/**](https://github.com/kunal-gohrani/spring-boot-dependency-injection/tree/master/src/main/java/com/springdi/springdi/controllers)
    - **SetterInjectedController.java** - In this spring component class, I have initialized the GreetingService dependency using a setter method by annotating it with @Autowired and @Qualifier. @Qualifier annotation enables us to specifically mention which concrete class implementation of the GreetingServiceInterface needs to be injected into the instance variable. The instance variable has been injected with SetterGreetingServiceImpl in runtime.
    - **ConstructorInjectedController.java** - In this spring component class, the greeting service dependency has been initialized using the constructor. In constructor way of dependency injection, @Autowired is optional. The instance variable has been initialized with ConstructorGreetingServiceImpl in runtime.
    - **PrimaryBeanInjectedController.java** - In this spring component class, the greeting service has been initialized using the constructor as well. But in this class, We haven't used a @Qualifier annotation, so in runtime, the instance variable gets injected with PrimaryGreetingServiceImpl since it has been annotated with @Primary. @Primary allows us to set a default bean to be injeted in case a @Qualifier annotation is not used.

## Output on running SpringDiApplication.java
---Primary Bean---
Hello from primary bean
---Setter Injected Bean---
Hello from Setter method way of Dependency Injection
---Constructor Injected Bean---
Hello from Constructor way of Dependency Injection
