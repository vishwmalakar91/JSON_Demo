# JSON_Demo

created form : https://dzone.com/articles/introduction-to-json-with-java


The Basics of JSON
JSON did not start out as a text-based configuration language. Strictly speaking, it is actually Javascript code that represents the fields of an object and can be used by a Javascript compiler to recreate an object. At its most elementary level, a JSON object is a set of key-value pairs — surrounded by braces and with a colon separating the key from the value; the key in this pair is a string —surrounded by quotation marks, and the value is a JSON value. A JSON value can be any of the following:

another JSON object
a string
a number
the boolean literal true 
the boolean literal false 
the literal null 
an array of JSON values
For example, a simple JSON object, with only string values, could be:

{"firstName": "John", "lastName": "Doe"}


Likewise, another JSON object can act as a value, as well as a number, either of the boolean literals or a null literal, as seen in the following example:

{
  "firstName": "John", 
  "lastName": "Doe",
  "alias": null,
  "age": 29,
  "isMale": true,
  "address": {
    "street": "100 Elm Way",
    "city": "Foo City",
    "state": "NJ",
    "zipCode": "01234"
  }
}




A JSON array is a comma-separated list of values surrounded by square brackets. This list does not contain keys; instead, it only contains any number of values, including zero. An array containing zero values is called an empty array. For example:

{
  "firstName": "John",
  "lastName": "Doe",
  "cars": [
    {"make": "Ford", "model": "F150", "year": 2018},
    {"make": "Subaru", "model": "BRZ", "year": 2016},
  ],
  "children": []
}


JSON arrays may be heterogeneous, containing values of mixed types, such as: 

["hi", {"name": "John Doe"}, null, 125]
