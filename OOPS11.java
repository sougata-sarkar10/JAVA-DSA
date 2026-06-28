class Pen {
    String color;
    String type;

    // Removed 'static' so 'this' can be used
    public void printColor() {
        System.out.println(this.color);
    }
}

public class OOPS11 {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "red";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "blue"; // Fixed: changed pen1 to pen2
        pen2.type = "gel";  // Fixed: changed pen1 to pen2

        pen1.printColor(); // Outputs: red
        pen2.printColor(); // Outputs: blue
    }
}
