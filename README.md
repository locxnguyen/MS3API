# MS3API
> Contact Management API 

## Table Contents
* [General info](#general-info)
* [Technologies](#technolgoies)
* [Prerequisite](#prerequisite)
* [Setup](#Setup)
* [Contact](Contact)

## General
Contact Management API - This project support full CRUD operation (Get, Post, Put & Delete)

## Technologies
* Oracle Virtual Box to host DB server or any virtual host environment
* MySql Database Server (Maria)
* MySql Workbench
* Postman 
* InterlliJ IDEA
* Spring Framework & Spring Boot
* GitHub

## Prerequisite
* Any MySql Database Server With Scheme name MS3
* [Download MySQL Workbench and install](https://dev.mysql.com/downloads/installer/)
* [Download Postman and Install](https://www.getpostman.com/downloads/)
* [Download IntelliJ IDEA and install](https://www.jetbrains.com/idea/)

## Setup
To execute this project, Please following step below
1. Get hostname or ip address, DB UserID and DBPassword of MySQL Database Server from Server Admin & DBA
2. Launch MySQL Workbench and Verify MySql Database Server With Scheme name MS3 is up
3. Launch IntellJ IDEA
4. Get Project from GitHub on to local drive and import the project into IntellJ IDEA or Checkout Project from Version Control direct into IntellJ IDEA (make sure to import Gradle)
   1. [Source Code Repository](https://gib.com/locxnguyen/MS3API)
   2. Local Diretory: C:\MS3\Projects\ContactAPI
5. Modify application.properties with correct information required below (from Server Admin & DBA);
   1. spring.datasource.url=jdbc:**mysql://192.168.1.17:3306/ms3?serverTimezone=UTC**
   2. spring.datasource.username=**ms3admin**
   3. spring.datasource.password=**ms3password**
6. Build, Run & Use Postman Sample below 

## Postman Sample
* Launch Postman
* [Get all Contact](http://localhost:8080/ms3test/all)
* [Get Individual contact](http://localhost:8080/ms3test/id/1)  **Must provide id number**
* [Delete Individual Contact](http://localhost:8080/ms3test/id/1)  **Must provide id number**
* [Update Individual Contact](http://localhost:8080/ms3test/update/1)  **Must provide id number**
  - Sample;
      '{
       "id": 1,
       "firstName": "JohnJohn",
       "lastName": "SmithSmith",
       "dob": "1980-10-22T04:00:00.000+0000",
       "gender": "MALE",
       "title": "Manager",
       "addresses": [
          {
            "id": 2,
            "type": "Home",
            "number": "111",
            "street": "Main st",
            "unit": "",
            "city": "Sterling",
            "state": "VA",
            "zipCode": "34111"
          },
          {
            "id": 3,
            "type": "Home",
            "number": "200",
            "street": "Holden rd",
            "unit": "",
            "city": "Richmond",
            "state": "VA",
            "zipCode": "43111"
          }
      ],
      "communication": [
          {
            "type": "CELL",
            "value": "990-110-1111",
            "preferred": true
          },
          {
            "type": "EMAIL",
            "value": "acme@acme.com",
            "preferred": true
          }
      ]
  }'

* [Add new contact](http://localhost:8080/ms3test/add)
  - Sample
  '{
    "firstName": "FirstNameGoHere",
    "lastName": "LastNameGoHere",
    "dob": "1980-10-22T04:00:00.000+0000",
    "gender": "MALE",
    "title": "Manager",
    "addresses": [
          {
            "type": "Home",
            "number": "111",
            "street": "Main st",
            "unit": "",
            "city": "Sterling",
            "state": "VA",
            "zipCode": "34111"
          },
          {
            "type": "Home",
            "number": "200",
            "street": "Holden rd",
            "unit": "",
            "city": "Richmond",
            "state": "VA",
            "zipCode": "43111"
          }
      ],
      "communication": [
          {
            "type": "CELL",
            "value": "990-110-1111",
            "preferred": true
          },
          {
            "type": "EMAIL",
            "value": "bigman@acme.com",
            "preferred": true
          }
      ]
  }'

## Contact
* Create by Loc X. Nguyen - Feel free to contact me! 
* Email:  locxnguyen@hotmail.com

