# Spring Boot 2 MultiProject

This is a demo of a Spring Boot 2 MultiProject with several layers and two DAO implementations using maven profiles: MyBatis or JPA + Hibernate.

It has the following modules:
- application
- services
- database
- mybatis-repository
- jpa-repository

Using maven profiles and Spring, the DAO implementation is chosen at build time. MyBatis is the DAO implementation by default.

mvn package -Pmybatis

mvn package -Pjpa

The profiles are designed to exclude the unused dependencies. For example, if you choose MyBatis, the module jpa-repository is excluded from the final JAR file.

## 1. Application

This module contains the Application entry point of the project. Also, it includes the application Controllers and common configuration shared between the layers.

The application Controllers invoke Services methods.

## 2. Services

This layer contains the Application Services used by Controllers or other Services. In this layer, Services can invoke DAO or other Services methods.

## 3. Database

This module sets up an in memory H2 Database for testing purposes. Also, it defines the DAO API with 2 implementations: jpa-repository and mybatis-repository. 

To avoid Hibernate or MyBatis dependencies on this module, in the entities for example, I have decided to translate the entities results from jpa-repository and mybatis-repository to an
intermediate entity defined in this module.

The modules jpa-repository and mybatis-repositoy are responsible to translate their entities definition to Database module entities.

## 4. MyBatis-repository

This module implements DAOs defined in database module and it uses MyBatis for this purpose. The DAO methods converts the MyBatis entities to database entities, defined in database module,
using the ModelMapper library.

## 5. JPA-repository

This module implements DAOs defined in database module and it uses JPA and Hibernate for this purpose. The DAO methods converts the JPA entities to database entities, defined in database module,
using the ModelMapper library.



