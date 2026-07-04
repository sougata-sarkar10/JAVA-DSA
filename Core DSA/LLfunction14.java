import java.util.LinkedList;

public class LLfunction14 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("This");
        list.addLast("is");
        list.addLast("a");
        list.addLast("linked");
        list.addLast("list");
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.add(2, "a");
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        System.out.println("Size of the list: " + list.size());

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");
    }
}
