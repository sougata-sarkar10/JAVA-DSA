public class Patterns2 {

    //Advance Patterns 
    public static void main(String[] args) {
        //Butterfly Pattern 

        int n = 5;
        //upper half
        for(int i = 1; i<=n; i++){
            //1st half
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }

            //space
            int space = 2*(n-i); 
            for(int j=1; j<=space;j++){
                System.out.print(" ");
            }

            //2st half
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half
        for(int i = n; i>=1; i--){
            //1st half
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }

            //space
            int space = 2*(n-i); 
            for(int j=1; j<=space;j++){
                System.out.print(" ");
            }

            //2st half
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

         // Solid Rhombus

        int n1 = 5;

        for(int i = 1; i<=n1; i++){
             //1st part space
            for(int j=n1-i; j>=1; j--){
                 System.out.print(" ");
            }

            //2nd part  star
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println();

        // Number Pyramid

        int n3=5;

        for(int i=1; i<=n3; i++){
            //space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //star
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();

        }

        System.out.println();

        //Pallindromic Number pyramid

        int n4=5;

        for(int i=1; i<=n4; i++){
            //space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //1st half
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }

            //2nd half
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }

            System.out.println();
        }

        System.out.println();
        
        //Diamond Star Pattern
        int n5 = 5;

        for(int i=1; i<=n; i++){
            //space
            for(int j=1; j<=n5-i; j++){
                System.out.print(" ");
            }

            //upper half
            for(int j=1; j<=2*i-1;j++){
                System.out.print("*");
            }

            System.out.println();
        }

        //lower half
        for(int i=n5; i>=1; i--){
            //space
            for(int j=1; j<=n5-i; j++){
                System.out.print(" ");
            }

            //upper half
            for(int j=1; j<=2*i-1;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
