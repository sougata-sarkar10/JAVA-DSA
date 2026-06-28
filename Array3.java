
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        // Array defining (1)
        int[] Arr = new int[3];

        Arr[0] = 1;
        Arr[1] = 13;
        for(int i=0; i<Arr.length; i++){
            System.out.println(Arr[i]);      //Arr[3] = 0  (As in java values are assinged NULL if not assigned)
        }
        
        System.out.println();

        // Array defining (2)
        int[] marks = {12,34};

        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        // Q. Take an array as input from user.Search for a given number x and print the index at which it occurs
        
        System.out.println("Input :");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numArr[] = new int[size];

        //input
        for(int i=0; i< size; i++){
            numArr[i] = sc.nextInt();
        }

         System.out.println("O/P :");
        //output
        for(int i=0; i<numArr.length; i++){
            System.out.print(numArr[i]);
            System.out.println();
        }

        System.out.println();
    }
}
