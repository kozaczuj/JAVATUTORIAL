System.out.println("Hello, world!");
// Output: Hello, world!
// System is a class from the core library provided by Java
// out is an object that controls the output
// println() is a method associated with that object that recives a single argument

// One line comment

/*
multi-line
comment
*/

public class Person {
  public static void main(String[] args) {
    System.out.println("Hello, world!");
  }
}

/*
every application must contain main() method
which is the entry point for the application
all other methods are invoked from main() method

the signature of the method is public static void main(String[] args) {...}
it accepts a single argument: an array of elements of type String
*/

/*
A class represents a single concept

A class name should be the same as the program filenaame

class Person should be in Person.java file
*/

/*
# compile java:
javac classname.java

# execute the compiled file:
java classname
*/

/*
In Java a statement is a line of code that executes a task and is terminated with a ;
*/

/*
Data types:
  boolean
  String
    - string is a Java Object that holds multiple characters. It is not primitive datatype
    - a string can be created by a pair of double quotes ""
    - to compare strings the equals() method must be used instead of the primitive
      equality comparator ==
  All primitive datatypes:
    int
    char
    boolean
    byte
    long
    short
    double
    float
    null
*/

/*
Static typing:
In Java the type of a variable is checked during compile time. This is known as
static typing. It has the advantage of catching errors at compile time rather
than at execution time.
*/

/*
final keyword:
the value of a variable cannot be changed if it was declared with keyword final
  final double PI = 3.14;
When a variable is declared using final it must be given a value.
Any attempts at changing a final variable will result in an error message
*/

/*
Order of operations:
parentheses -> multiplication -> division -> modulo -> addition -> subtraction
*/

/*

*/
