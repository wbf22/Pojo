# Pojo and Python var

This libary is free to use. It provides the following:

<br />

# Table of Contents
1. [Pojo](#Pojo)
2. [var](#var)
3. [Usage](#Usage)

## Pojo
- Quick and easy way to create a simple Pojo in one line
- Quick and easy way to generate class code from that Pojo
- Function to convert Pojo object quickly to json
- Static function to extract Pojo object form json


### Examples
To create a Pojo quick and easy, try something like this below:

````java
Pojo doctor = new Pojo("specialty", "heart", "degree", "cardiology", "name", "Rob Salazar");
````

This creates a basic pojo object which when printed or after calling Pojo.toString() will output:

```
{
  specialty = heart
  degree = cardiology
  name = Rob Salazar
}
```

You can specify as many member variables as you want up to 20. It goes the variable/field name first
followed by the value. Any class or primitive type is valid. 

```java
Pojo myPojo = new Pojo("fieldName1", "value1", "fieldName2", 2.0f, "fieldName3", 3.0d...
```
If you need more member variables, pass in a map of the type
Map<String, Object>.

If you decide you'd rather have a java class for your object instead of using the pojo
abstraction, call .build()

```java
doctor.build("Doctor", "<output directory name you choose>", false);
```
Calling this outputs the following in a file called Doctor.java

```java
public class Doctor {

  private java.lang.String specialty;
  private java.lang.String degree;
  private java.lang.String name;

  public java.lang.String getSpecialty() {
    return specialty;
  }

  public void setSpecialty(java.lang.String specialty) {
    this. specialty = specialty;
  }

  public java.lang.String getDegree() {
    return degree;
  }

  public void setDegree(java.lang.String degree) {
    this. degree = degree;
  }

  public java.lang.String getName() {
    return name;
  }

  public void setName(java.lang.String name) {
    this. name = name;
  }


}
```
You can also call build() like this and it will output to "src/main/java" by default.

```java
doctor.build("Doctor", false);
```
The last field which is a boolean will make the generator create the constructor when true.

If you already have a Pojo object and you'd like to make an empty instance of it call
getBlankOfThisPojo()

```java
Pojo student = new Pojo("fullName", String.class, "age", int.class, "grade", int.class, "ageInMilliseconds", long.class);
Pojo student1 = student.getBlankOfThisPojo();
student1.set("fullname", "Darly Cunnings", "age", 23);
```
You can get the json file of your pojo by calling toJsonPretty(). 
```java
Pojo student = new Pojo("fullName", "Bradly Davis", "age", 1, "grade", 1, "ageInMilliseconds", 20000000);
System.out.println(student.toJsonPretty());
```

```json
{
  "memberVariables" : {
    "grade" : 1,
    "fullName" : "Bradly Davis",
    "age" : 1,
    "ageInMilliseconds" : 20000000
  }
}
```
You can also call toJson() but the output will all be on one line.

<br />
You can also extract a Pojo object from Json by calling the static method
fromJson().

```java
Pojo student = new Pojo("fullName", "Bradly Davis", "age", null, "grade", 1, "ageInMilliseconds", 10000000);
String json = student.toJson();
Pojo extracted = Pojo.fromJson(json);
```

## var
- python var like data type that can be assigned to any object
- can be a java collection with all standard methods except splitIterator()
- can perform math on primitive types and BigDecimal

###Examples
Assign/create a var like this:
```java
var myVariable = new var(1.0f);
```
Anything can be passed into the var constructor. Supported Data types:

- boolean
- byte
- short
- int
- double
- float
- char
- BigDecimal
- Object
- String
- Arraylist
- Set
- Queue
- LinkedList
- Stack
- Map

Once you've made a var object and you'd like to convert it back to one of these types
use the corresponding converter functions.
```java
  boolean bl = var.toBoolean();

  char ch = var.toChar();

  byte by = var.toByte();

  short sh = var.toShort();

  int in = var.toInt();

  long lon = var.toLong();

  float flo = var.toFloat()

  double dob = var.toDouble()
  
  BigDecimal big = var.toBigDecimal()

```

For collections there's a converter for each of the collections for each
of the types above, so I won't list them all. Here are a few:
```java
Arraylist<String> strings = var.toArrayListString();

Set<Integer> ints = var.toSetInt();

Map<String, BigDecimal> nums = var.toMapStringBigDecimal();
```

The following funcitons are supported for all of the collection types

- add()
- addAll()
- clear()
- contains()
- containsAll()
- isEmpty()
- iterator()
- remove()
- removeAll()
- retainAll()
- size()
- toArray() x2
- stream()
- parallelStream()
- removeIf()
- forEach()

## Usage
You can download the jar file [here](https://github.com/wbf22/Pojo/tree/master/out/artifacts/PojoMaker_jar)

In intellij you can add a jar file by going to
File > Project Structure > Libraries > + > Java and then select 
the jar file you downloaded. (Though you should probably put it somewhere safer then your downloads folder)






