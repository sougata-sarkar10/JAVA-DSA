import java.util.ArrayList;
import java.util.Collections;

public class ArrayList12 {
    public static void main(String[] args) {
        //ArrayList declaration
        ArrayList<Integer> list = new  ArrayList<>();

        //Adding element in ArrayList
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);
        //Get Elemets
        int ele = list.get(3);
        System.out.println(ele);    //Get element at index 3

        //Calculate Size of ArrayList
        System.out.println("Size :"+ list.size());

        //Loop to get elements
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("***After Modification***");

        //Modify the list
        //with add()
        list.add(5,6);
        ArrayList<Integer> list1 = list;

        //with set()
        list.set(0, 10);
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        //Sorting the ArrayList
        Collections.sort(list);
        System.out.println("Sorted :" + list);
    }
}
