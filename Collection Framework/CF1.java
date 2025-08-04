package CollectionFramework;
import java.util.*;

public class CF1 {
    public static void main(String[] args) {

//        creating collection
        /*
        * 1) Type Safe - same types of ele or objs are added to collection
        * 2)Un/Non Type Safe - diff types of ele or objs are added to collection
        * */

//        type safe collection
        ArrayList<String> names = new ArrayList<>();
//        add
        names.add("Swati");
        names.add("Manav");
        names.add("Manav");
        System.out.println(names);
//        get elements
//        System.out.println(names.get(0));

//        Untype Safe collection
        /*LinkedList list = new LinkedList();
        list.add("Mena");
        list.add(99.8);
        list.add(27);
        list.add(true);
        System.out.println(list);*/

//        remove
        names.remove("Manav");
        System.out.println(names);

//        size
        System.out.println("Size = "+names.size());

//        item is there or not
//        Types ka equals method call karta h checking krne ke liye
        System.out.println(names.contains("Swati Priya"));

//        check for empty
        System.out.println(names.isEmpty());

//        replacing value by new value
        names.set(0,"Rani");
        System.out.println(names);

//        add new ele in the given index
        names.add(1,"Swati");
        System.out.println(names);


//        typesafe vector
        Vector<String> vector = new Vector<>();
        vector.addAll(names);
        System.out.println(("Vector" + vector));
    }
}
