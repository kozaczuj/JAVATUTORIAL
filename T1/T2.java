public class Person {
  // state of an object
  int age;
  String name;
  
  //behavior of an object
  public void set_value() {
    age = 20;
    name = "Robin";
  }
  
  public void get_value() {
    System.out.println("Age is " + age);
    System.out.println("Name is " + name);
  }
  
  // main method
  public static void main(String[] args) {
    // create a new Person object
    Person p = new Person();
    
    //change state through behavior
    p.set_value();
  }
}

/*
Java instances are objects based on classes. For example p is an instance
of class Person

Every instance has access to its won set of variables which are known as instance fields
which are variables declared witihn the scope of the instance

Values for instance fields are assigned within constructor method, which if not
declared is replaced by a default constructor
*/

/*
To access methods or variables of an object we use a . notation in Java
object.variable
object.method(arguments)
*/

/*
Constructor method in Java is used to create instances of the class

The constructor is named after the class

If no constructor is defined, a default empty one is used
*/

/*
Creating new Java class instance:
In java we use new keyword followed by a call to the class constructor in order
to create a new instance of class

Initial values for the instance fields can be provided by a constructor
*/

/*
Reference data types:

A variable with a reference data type has a value that references the memory
address of an instance. During cariable declaration, the class name is used as the variable's type.
*/

/*
Constructor signatures:

A class can contain multiple constructors as long as they have a different
set of arguments

A signature helps compiler to differentiate between the different constructors

A signature is made up of the constructor's name and list of pararmeters
*/

/*

*/
