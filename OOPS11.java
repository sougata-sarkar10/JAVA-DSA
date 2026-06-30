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
    }
}