
class Pen {
    String color;
    String type;

    public void printColor() {
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;
    
    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);

    }

    //Non-Parameterised Constructor
    Student(){
        System.out.println("Constructor called");
    }

    //Parameterised Constructor
    Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    // //Copy constructor
    // Student(Student s2){
    //     this.name = s2.name;
    //     this.age = s2.age;
    // }

}

// Polymorphism 
class School{
    String name;
    int ESTD;
    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int ESTD) {
        System.out.println(ESTD);
    }

    public void printInfo(String name,int ESTD) {
        System.out.println(name + " " + ESTD);
    }

}

//Inheritance
class Shape{
    String color;
}

class Triangle extends Shape{
    public void printSides() {
        System.out.println("Having three sides");
        System.out.println(color);
    }
}

class EquilateralTriangle extends Triangle{
    public void sidesSize() {
        System.out.println("Having equal size of sides");
        System.out.println(color);
    }
}

//ABSTRACTION
abstract class Animal{
    public void walk(){
        System.out.println("Walks");
    }
}

class Horse extends Animal{
    public void speed(){
        System.out.println("Runs very fast");
    }
}

//Access Modifiers
class Account{
    public String name;    //public
    protected String email ;   //protected
    private String password;   //private

    //getters and setters
    public String getPassword(){
        return this.password;
    }

    public void setPassword(String pass){
        this.password = pass;
    }

}

// Abstraction using INTERFACE 
interface Animal1{
    public void walks();
}
interface Herbivore2{
    void eats();
}

//Multiple Inheritance
class Horse1 implements Animal1,Herbivore2{
    public void walks() {
        System.out.println("walks on four legs");
    }
    public void eats(){
        System.err.println("Eats Grass");
    }
}
public class OOPS11 {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "red";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "blue"; 
        pen2.type = "ball";  

        pen1.printColor(); 
        pen2.printColor(); 

        System.out.println();

        // Student s1 = new Student();   //Student() -> Constructor
        // s1.name = "rohan";
        // s1.age = 12;

        Student s1 = new Student("Michal",34);
        s1.printInfo();

        // Student s2 = new Student(s1);   //copy constructor
        // s2.printInfo();


        //POLYMORPHISM
        School h1 = new School();
        h1.printInfo("bal mandir");
        h1.printInfo(1986);
        h1.printInfo("bal mandir",1986);

        //INHERITANCE
        //Single level
        Triangle t1 = new Triangle();
        t1.color = "red";

        t1.printSides();

        //Multi level 
        EquilateralTriangle t2 = new EquilateralTriangle();
        t2.color = "green";

        t2.sidesSize();

        //PACKAGE
        Account ac1 = new Account(); 
        ac1.name = "customer1";

        System.out.println(ac1.name);

        //ENCAPSULATION
        //same the things we are doing in class

        //ABSTRACTION
        Horse a1 = new Horse();
        a1.walk();

        // Animal a2 = new Animal();    // it will give run time error as it is abstract class
        // a2.walk();

        //GETTER AND SETTER (for the private access modifier)
        Account acc2 = new Account();
        acc2.name  = "customer2";
        acc2.email = "abc@10";
        acc2.setPassword("abcde");
        System.out.println(acc2.getPassword());

        //INTERFACE(MULTIPLE INHERITANCE)
        Horse1 myHorse = new Horse1();
        myHorse.walks();
        myHorse.eats();
    }
}