
import java.util.*;
public class BitManipulation7 {
    
    public static void main(String[] args) {

        //GET bit operation 

        int n1 = 5;
        int pos1 = 2;
        int bitmask1 = 1<<pos1;

        if((bitmask1 & n1 ) == 0 ){
            System.out.println("Bit was zero");
        }else{
            System.out.println("Bit was one");
        }

        //SET bit operation

        int n2 = 5;
        int pos2 = 1;
        int bitmask2 = 1<<pos2;

        int newNumber1 = bitmask2 | n2;
        System.out.println(newNumber1);

        //Clear Bit

        int n3 = 5;
        int pos3 = 2;
        int bitmask3 = 1<<pos3;
        int notBitMask = ~(bitmask3);

        int newNumber2 = notBitMask & n3;
        System.out.println(newNumber2);

            //Update operation 
            Scanner sc = new Scanner(System.in);
            int oper = sc.nextInt();

            int n4 = 5;
            int pos4 = 1;

            int bitmask4 = 1<<pos4;

            if(oper == 1){
                //set
                int newNumber3 = bitmask4 | n4;
                System.out.println(newNumber3);
            }else{
                int newBitMask = ~(bitmask4);
                int newNumber3 = newBitMask & n4 ;
                System.out.println(newNumber3);
            }
            sc.close();
        }
    }
