import java.util.HashSet;
import java.util.Iterator;

public class HashSet19 {

    public static void main(String arg[]){
        HashSet<Integer> set = new HashSet<>();

        //Adding elements to HashSet
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);  //duplicate element, will not be added again

        System.out.println(set);

        //Removing an element from HashSet
        set.remove(2);

        //Searching for an element in HashSet
        if(set.contains(3)){
            System.out.println("Element  is present in the HashSet");
        } else {
            System.out.println("Element  is not present in the HashSet");
        }

        //Iterating through the HashSet
        System.out.println("Elements in the HashSet:");
        Iterator it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
