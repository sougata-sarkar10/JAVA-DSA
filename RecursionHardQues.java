import java.util.ArrayList;

public class RecursionHardQues {

    //FIND THE PERMUTATION
    public static void printPerm(String str,String permutation){
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }

        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            //"abc" -> "ab"
            String newStr = str.substring(0,i)+ str.substring(i+1);
            printPerm(newStr, permutation+currChar);
        }
    }

    //FIND TOTAL PATHS IN A MAZE OF (n,m)
    public static int countPaths(int i,int j,int n,int m) {
        if(i==n || j==m){
            return 0;
        }
        if(i == n-1 && j == m-1){
            return 1;
        }
        //move downwards
        int downPaths = countPaths(i+1, j, n, m);
        //move rightside
        int rightPaths = countPaths(i, j+1, n, m);

        return downPaths + rightPaths;
    }

    //PLACE TILES IN A FLOOR
    public static int placeTiles(int n, int m) {
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        
        //vertically
        int vertPlacements = placeTiles(n-m, m);

        //horizontally
        int horPlacements = placeTiles(n-1, m);
        
        return vertPlacements + horPlacements;
    }
    //call guest to the party n = 4
    public static int callGuest(int n) {
        if(n <= 1){
            return 1;
        }
        //single
        int way1 = callGuest(n-1);

        //pair
        int way2 = (n-1)*callGuest(n-2);

        return way1 + way2;
    }

    //FIND SUBSET OF A SET OF FIRST N NATUAL NUMBER

    public static void printSubsets(ArrayList<Integer>subsets) {
        for(int i=-0;i<subsets.size();i++){
            System.out.print(subsets.get(i) + " ");
        }
        System.out.println();
    }
    public static void findSubsets(int n,ArrayList<Integer>subsets) {
        if(n==0){
            printSubsets(subsets);
            return;
        }
        //add
        subsets.add(n);
        findSubsets(n-1, subsets);

        //remove
        subsets.remove(subsets.size()-1);
        findSubsets(n-1, subsets);
    }
    public static void main(String[] args) {
        //permutation
        String str = "abc";
        printPerm(str, "");

        System.out.println();

        //total paths of maze
        int n = 4, m=4;
        System.out.println(countPaths(0, 0, n, m));

        System.out.println();

        //total pways to place the tiles
        System.out.println(placeTiles(n, m));

        System.out.println();

        //ways to get the guests
        System.out.println(callGuest(n));

        System.out.println();

        //print n natural numbers subset
        int n1 = 2;
        ArrayList<Integer> subsets = new ArrayList<>();
        findSubsets(n1, subsets);
    }
}
