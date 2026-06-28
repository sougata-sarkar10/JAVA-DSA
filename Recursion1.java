public class Recursion1{

    //Print numbers from 5 - 1
    public static void printNum(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        printNum(n-1);
    }

    //Print numbers from 1 - 5
    public static void printNum1(int n){
        if(n==6){
            return ;
        }
        System.out.println(n);
        printNum1(n+1);
    }

    //Sum of natural numbers
    public static void SumNum(int i, int n, int sum){
        if(i == n){
            sum +=i;
            System.out.println(sum);
            return;
        } 

        sum +=i;
        SumNum(i+1,n,sum);
    }

    //Factorial
    public static int calcFact(int n){
        if(n==1 || n==0){
            return 1;
        }

        int fact_nm1 = calcFact(n-1);
        int fact_n = n*fact_nm1;
        return fact_n;
    }

    //Fibonacci nth term 

    public static void printFib(int a, int b, int n){
        if(n==0){
            return;
        }
        int c = a+b;

        System.out.println(c);
        printFib(b, c, n-1);
    }

    //Calculate the power of X (stack height = n)

    public static int calcPow(int x, int n){
        if(x == 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }

        int xPow1 = calcPow(x,n-1);
        int xPow = x*xPow1;
        return xPow;
    }

    //Calculate the power of X(Stack height = log n)

    public static int calcPowOpt(int x, int n){
        if(x == 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }

        if(n % 2==0){
            return calcPowOpt(x,n/2) * calcPowOpt(x,n/2);
        }else{
            return calcPowOpt(x,n/2) * calcPowOpt(x,n/2) * x;
        }
    }
    public static void main(String arg[]){

        // int n = 5;
        // printNum(n);

        // int n = 1;
        // printNum(n);

        //Print n natural numbers
        SumNum(1,6,0);
        
        System.out.println();

        //Calculate factorial
        System.out.println(calcFact(3));

        System.out.println();

        //Print fibonacci sequence
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);

        int n = 7;
        printFib(a,b,n-1);

        System.out.println();

        //Calculate the power of X

        System.out.println(calcPow(5,2));

        System.out.println();

        //Calculate the power of X (log n)

        System.out.println(calcPowOpt(5,2));

        System.out.println();


    }
}