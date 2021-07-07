# Pojo

This libary is free to use. It provides the following:

<br />



### Pojo.java
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