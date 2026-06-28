
public class Patterns1{
    public static void main(String arg[]){
        
        //Solid Reatangle
        for(int i=1; i<=4; i++){
            for(int j=1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.err.println();

        //Hollow Rectangle
        int n = 4 ;//row
        int m = 5 ;//column

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(i==1 || j==1 || i==n || j==m){
                 System.out.print("*");
                }else{
                System.err.print(" ");
                }
            }
            System.err.println();
        }

        System.out.println();

        //Half Pyramid 
        int r = 4;
        for(int i=1; i<=r; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        //Half Pyramid inverted

        for(int i=r; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        //Half Pyramid (180 deg inverted)

        for(int i=1; i<=r; i++){
            //inner loop for zero 
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //inner loop for star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        //Half Pyramid with numbers
        int n1 = 5;

        for(int i=1; i<=n1; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();

        //Inverted Half Pyramid with numbers

        for(int i=n1; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();

        // FLOYD's TRIANGLE

        int n2 = 5;
        int num = 1;
        for(int i=1; i<=n2; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

        System.out.println();

        int n3 = 5;
        
        for(int i=1; i<=n3; i++){
            for(int j=1; j<=i; j++){
                int sum = i+j;
                if (sum % 2==0) {
                    System.err.print("1" + " ");
                }else {
                    System.err.print("0" + " ");
                }
            }
            System.out.println();
        }


    }
}