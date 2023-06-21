# User API SPEC

## Register User

Endpoint : POST /api/users

Request Body :
```json
{
  "username" : "nurdin",
  "password" : "secret",
  "name" : "Nurdin Ahmad Alawiyah"
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

## Login User

Endpoint : POST /api/auth/login

Request Body :
```json
{
  "username" : "nurdin",
  "password" : "secret"
}
```

Response Body (Success) :

```json
{
  "data" : {
    "token" : "TOKEN",
    "expiredAt" : 541526125 //milisecond
  }
}
```

Response Body (Failed, 401) :
```json
{
  "errors" : "Username or Password is wrong"
}
```

## Get User

Endpoint : GET /api/users/current

Request Header : 
- X-API-TOKEN : Token (Mandatory)

Response Body (Success) :

```json
{
  "data" : {
    "username" : "nurdin",
    "name" : "Nurdin A. Alawiyah"
  }
}
```

Response Body (Failed, 401) :
```json
{
  "errors" : "Unauthorized"
}
```

## Update User

Endpoint : PATCH /api/users/current

Request Header :
- X-API-TOKEN : Token (Mandatory)

Request Body :
```json
{
  "name" : "Nurdin Ahmad Alawiyah", // put if only want to update
  "password" : "secret" // put if only want to update
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
  "errors" : "Username or Password is wrong"
}
```

## Logout User

Endpoint : DELETE /api/auth/logout

Request Header :
- X-API-TOKEN : Token (Mandatory)

Request Body :
```json
{
  "name" : "Nurdin Ahmad Alawiyah", // put if only want to update
  "password" : "secret" // put if only want to update
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
  "errors" : "Username or Password is wrong"
}
```