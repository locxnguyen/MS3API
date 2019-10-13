# MS3API
> Contact Management API 

## Table Contents
* [General info](#general-info)
* [Technologies](#technolgoies)
* [Prerequisite](#prerequisite)
* [Setup](#Setup)
* [Contact](Contact)

## General
Contact Management API - This project give ability to (Get, Post, Put & Delete)

## Technologies
* Oracle Virtual Box 
* MySql 
* MySql Workbench
* Postman 
* InterlliJ IDEA
* GitHub

## Prerequisite
> MySql 
> SpringFramework

## Setup
To Run 

## Postman Sample
* Get all Contact
http://localhost:8080/ms3test/all

* Get Individual contact (Must provide id unique id number {}
http://localhost:8080/ms3test/id/{1}

* Delete Individual Contact (Must provide id unique id number {}
http://localhost:8080/ms3test/id/{1}

* Update Individual Contact (Must provide id unique id number {}
http://localhost:8080/ms3test/update/{1}
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

* Add new contact
http://localhost:8080/ms3test/add
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
* Cell:  202 427-5060

