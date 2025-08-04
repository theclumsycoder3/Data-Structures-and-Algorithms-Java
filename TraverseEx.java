package CollectionFramework;

import com.sun.source.tree.Tree;

import java.util.*;

public class TraverseEx {
    public static void main(String[] args) {
//        Way to List Traverse -
//        1) for each loop
//        2) iterator
//        3) listiterator
//        4)enumeration
//        5)for each method

        ArrayList<String> names = new ArrayList<>();
//        add
        names.add("Swati Priya");
        names.add("Manav");
        names.add("Manaviii");
        names.add("Manav");

//        for each loop
        for(String str: names){
            System.out.print(str + "\t" +str.length() +"\t");
            StringBuffer sb = new StringBuffer(str);
            System.out.println(sb.reverse());
        }
        System.out.println("______________________________________");

//        iterator -> has method hasnext
        Iterator<String> itr = names.iterator();
        while(itr.hasNext()){
            String next = itr.next();
            System.out.println(next);
        }
        System.out.println("_________________________________________");

//        ListIterator
//        backward traversal of collection LISTITERATOR -> has method hasprevious
//        names.size() -> put the cursor in the end of the list
        ListIterator<String> litr= names.listIterator(names.size());
        while(litr.hasPrevious()){
            String previous = litr.previous();
            System.out.println(previous);
        }
        System.out.println("___________________________________________");

//        Enumeration
        Vector<String> names1 = new Vector<>();
//        add
        names1.add("Swati Priya");
        names1.add("Manav Sahay");

        Enumeration<String> en = names1.elements();

        System.out.println("Traversing Vector using Enumeration: ");

        while(en.hasMoreElements()){
            String name1 = en.nextElement();
            System.out.println(name1);
        }

        System.out.println("____________________________________________");

//        for each method -> lambda fn - function interface ke andar jo method h uski implementation provide krne ke liye hota h
        names.forEach(e->{
            System.out.println(e);
        });
        System.out.println("____________________________________________");


        //        Way to Set Traverse -
//        1) for each loop
//        2) iterator
//        3)for each method

//        example
        TreeSet<String> ts = new TreeSet<>();
        ts.addAll(names);

        ts.forEach(e->{
            System.out.println(e);
        });

//        Custom Sorting logic define - Comparable and Comparator


    }
}
