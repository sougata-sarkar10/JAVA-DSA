import java.util.HashSet;

public class RecursionQuestions{
    //TOWER OF HANOI
    public static void towerOfHanoi(int n,String src,String helper, String dest){
        if(n == 1){
            System.out.println("Transfer disk " + n +" from " +src+ " to " +dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transfer disk " + n +" from " +src+ " to " +dest);
        towerOfHanoi(n-1, helper,src, dest);
    }

    //REVERSE A STRING
    public static void stringRev(int idx,String str) {
        if(idx == 0){
            System.out.print(str.charAt(idx));
            return;
        }

        System.out.print(str.charAt(idx));
        stringRev(idx-1,str); 
    }

    //FIND CHAR AT IDX AT FIRST AND LAST
    public static int first=-1;
    public static int last=-1;

    public static void findOccurance(String str,int idx,char element){
        if(idx == str.length()){
            System.err.println(first);
            System.err.println(last);
            return;
        }

        char currChar = str.charAt(idx);
        if(currChar == element){
            if(first == -1){
                first = idx;
            }else{
                last = idx;
            }
        }

        findOccurance(str, idx+1, element);
    }

    //Check the sorted or not
    public static boolean isSorted(int arr[],int idx){
        if(idx == arr.length - 1){
            return true;
        }
        if(arr[idx] < arr[idx+1]){
            //array is sorted
            return isSorted(arr,idx+1);
        }else{
            return false;
        }
    } 

    //move all char's to the end(here it is "x")
    public static void moveChar(String str,int idx,int count,String newString){

        if(idx == str.length()){
            for(int i=0;i<count;i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++; 
            moveChar(str,idx+1,count,newString);
        }else{
            newString += currChar;
            moveChar(str,idx+1,count,newString);
        }
    } 

    // remove duplicate chars 
    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str,int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            removeDuplicates(str,idx+1,newString);
        }else{
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx+1, newString);
        }
    }

    //find Sub sequences
    public static void subSequences(String str,int idx,String newString) {
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);

        //to be 
        subSequences(str, idx+1, newString+currChar);

        //not to be
        subSequences(str, idx+1, newString);
        
    }

    // Implementing HashSet for avoiding the repetation in sub sequence
    
    public static void subSequencesWithSet(String str,int idx,String newString,HashSet<String>set) {
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);

        //to be 
        subSequencesWithSet(str, idx+1, newString+currChar,set);

        //not to be
        subSequencesWithSet(str, idx+1, newString,set);
        
    }
    //Print keypad strings 

    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vqx","yz"};

    public static void printComb(String str,int idx,String combination) {
        if(idx == str.length()){
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];

        for(int i=0;i<mapping.length();i++){
            printComb(str,idx+1,combination+mapping.charAt(i));
        }
    }
    public static void main(String arg[]){
        int n = 3;
        towerOfHanoi(n, "S", "H", "D");

        System.out.println();

        String str = "abcd";
        stringRev(str.length()-1,str);

        System.out.println();

        String str1 = "aabffgyvbjhbamknijaadc";
        findOccurance(str1, 0, 'a');

        System.out.println();

        int arr[] = {2,6,9};
        System.out.println(isSorted(arr,0));

        System.out.println();

        String str2 = "abxcxxd";
        moveChar(str2,0,0,"");

        String str3 = "abbxccxxfsfd";
        removeDuplicates(str3, 0, "");

        System.out.println();
        
        String str4 = "abc";
        subSequences(str4, 0, "");

        System.out.println();
        
        String str5 = "aaa";
        HashSet<String> set =  new HashSet<>();
        subSequencesWithSet(str5, 0, "", set);

        System.out.println();
        
        String str6 = "23";
        printComb(str6, 0, "");
    }
}
