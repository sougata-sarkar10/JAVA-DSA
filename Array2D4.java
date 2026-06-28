import java.util.Scanner ;

public class Array2D4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] Matrix = new int[rows][cols];

        //input
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                Matrix[i][j] = sc.nextInt();
            }
        }

        //input
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Q. Take an Matrix as input from user.Search for a given number x and print the index at which it occurs

        int[][] Mat ={{1,3,5},{4,6,2}};

        System.out.print("Enter the number x to search for: ");
        int input = sc.nextInt();
        boolean found = false;

        for(int i=0; i<Mat.length; i++){
            for(int j=0; j<Mat[i].length; j++){
                if(input == Mat[i][j]){
                    System.out.println("Found at index coordinates: (" + i + ", " + j + ")");
                    found = true;
                }
            }
        }
        if(!found) {
            System.out.println("Number not found in the matrix.");
        }

    }
}
