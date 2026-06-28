import java.util.Scanner;

public class String5 {
    public static void main(String[] args) {

        //Input string
        Scanner sc = new Scanner(System.in);

        // String Name = sc.nextLine();
        // System.out.println(Name);

        //Contatenation operation

        String fName = "renu";
        String lName = "deb";

        String fullName = fName + " " + lName;

        System.out.println(fullName);

        //length function
        System.out.println(fullName.length());

        //charAt function
        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }

         System.out.println();

        //Compare strings
        String n1 = "hello";
        String n2 = "hello";

        if(n1.compareTo(n2) == 0){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }

        //subString
        String sent = "my name is ben";
        String part = sent.substring(0,2);
        System.out.println(part);

        

    }
}
