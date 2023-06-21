# Contact API SPEC

## Create Contact

Endpoint : POST /api/contacts

Request Header :
- X-API-TOKEN : Token (Mandatory)

Request Body :
```json
{
  "id": "random string",
  "firstname" : "Nurdin Ahmad",
  "lastname" : "Alawiyah",
  "email" : "nurdinahmada@gmail.com",
  "phone" : "08977612607"
}
```

Response Body (Success) :

```json
{
  "data" : {
    "firstname" : "Nurdin Ahmad",
    "lastname" : "Alawiyah",
    "email" : "nurdinahmada@gmail.com",
    "phone" : "08977612607"
  }
}
```

Response Body (Failed, 401) :
```json
{
  "errors" : "Email format invalid, phone format invalid, ...."
}
```

## Update Contact

Endpoint : PUT /api/contacts/{idContact}

Request Header :
- X-API-TOKEN : Token (Mandatory)

Request Body :
```json
{
  "id": "random string",
  "firstname" : "Nurdin Ahmad",
  "lastname" : "Alawiyah",
  "email" : "nurdinahmada@gmail.com",
  "phone" : "08977612607"
}
```

Response Body (Success) :

```json
{
  "data" : {
    "id": "random string",
    "firstname" : "Nurdin Ahmad",
    "lastname" : "Alawiyah",
    "email" : "nurdinahmada@gmail.com",
    "phone" : "08977612607"
  }
}
```

Response Body (Failed, 401) :
```json
{
  "errors" : "Email format invalid, phone format invalid, ...."
}
```

## Get Contact

Endpoint : POST /api/contact/{idContact}

Request Header :
- X-API-TOKEN : Token (Mandatory)

Response Body (Success) :

```json
{
  "data" : {
    "id": "random string",
    "firstname" : "Nurdin Ahmad",
    "lastname" : "Alawiyah",
    "email" : "nurdinahmada@gmail.com",
    "phone" : "08977612607"
  }
}
```

Response Body (Failed, 404) :
```json
{
  "errors" : "Unauthorized"
}
```

## Search Contact

Endpoint : GET /api/contacts

Query Param : 
- name : String, contact first name or last name, using like query, optional 
- phone : String, contact phone, using like query, optional
- email : String, contact email, using like query, optional
- page : Integer, start from 0. default 0
- size : Integer, default 10

Request Header :
- X-API-TOKEN : Token (Mandatory)

Request Body :
```json
{
  "data": [
    {
      "id": "random string",
      "firstname": "Nurdin Ahmad",
      "lastname": "Alawiyah",
      "email": "nurdinahmada@gmail.com",
      "phone": "08977612607"
    }
  ],
  "paging": {
    "currentPage": 0,
    "totalPage": 10,
    "size": 10
  }
}
```

Response Body (Success) :

```json
{
  "data" : "OK"
}
```

Response Body (Failed, 401) :
```json
{
  "errors" : "Username must not blank"
}
```

## Remove Contact

Endpoint : DELETE /api/contact/{idContact}

Request Header :
- X-API-TOKEN : Token (Mandatory)

Response Body (Success) :

```json
{
  "data" : "OK"
}
```

Response Body (Failed, 401) :
```json
{
  "errors" : "Contact Not Found"
}
```