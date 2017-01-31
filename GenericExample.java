import java.util.*;

public class GenericExample{

    public static void main(String... args){
    
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list.size());
        list.add("William");
        System.out.println(list.size());
        list.add(0, "Keller");
        System.out.println(list);
        String ln = "Keller";
        System.out.println(list.contains("Kulis"));
        System.out.println(list.contains(ln));
        String firstName = list.get(1);
        System.out.println(firstName);
        System.out.println(ln);
    }
}