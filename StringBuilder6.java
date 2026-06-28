
public class StringBuilder6{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");

        System.out.println(sb);

        // Char at index 0
        System.out.println(sb.charAt(0));

        // SetCharAt()
        sb.setCharAt(0,'P');
        System.out.println(sb);

        //insert()
        sb.insert(2,'n');
        System.out.println(sb);

        //delete()
        sb.delete(2,3);
        System.out.println(sb);

        //append()
        sb.append('s');
        System.out.println(sb);

        
    }
}