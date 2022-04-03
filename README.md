## spring-jpa-example
 Spring boot with H2 and JPA example
 
 ### Spring Data Notes
 - Spring data is collection of Java Data Access modules which share some common abstractions, reduce boilerplate and generally make data access simpler.
 - With java application,persitant layer is not same sometime it is SQL (Oracle, MySql, PSQL etc) or sometime NoSQL (MongoDB, Cassendra etc). so Spring provide core module which is become more lightwrigt, loose coupled, centric with wrapper of Spring Data.
 - This approach make solution faster, more easy and developer dont need deep knowlegde as a DBA. Developer can focus on bussiness logic.
 
 ### Repository Pattern
 - Repository is Persistance Ignorance Data Access pattern, it means instread of queueing directly to database, application code will communicate with repository interface and repository interface handle rest part.
 - There are heirarchy of Repository pattern available in Spring Data, developer can choose anyone of then as per need.

#### Repository Inerface
- Repository interface placed in top of Repository pattern this is marker interface with no methods just argument types for the entity you want to persist and ID class of the entity.

#### CRUDRepository
- Second base interface id CRUDRepository which is most used in Spring Data Project.
- This repository handles CRUD operation Create, Read, Update, Delete without writting any code by client 
- Useful Methods
    - save : Create or Update
    - findById : Search
    - delete : remove data from DB
    
#### Paging and Sorting Repository
- Paging and Sorting repository is help for sort data and split it into chunks.


### JPA (Java Persistence API)
- JPA focus on object relational mapping or commonly refered to as just ORM design principle.
- JPA started as Hibernate initially
- THis is POJO based implementation which supports HQL, Java Friendly Queries to avoid DBA knowledge

#### Why JPA?
- Reduce developers effords for understand DBA terminology in depth.
- Easy configuration, operations and implementations faster
- Developer can focus on only bussiness logic instead infrastucture
- Spring can able to handle transaction management with configuration and annotations which is great benefit
