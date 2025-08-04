package Generic;
import java.util.*;
public class Demo {
    public static void main(String[] args) {
//        Generic - typesafe - used to detect error in compile time
//        provides type safety
        List<Integer> list = new ArrayList<>();
//        list.add("mnv");
        list.add(123);

//        Non generic - un type safe
//        object class is used to make the datatype general - any datatypes can be used
        List al = new ArrayList();
        al.add("dhd");
        al.add(1234);

        System.out.println(list);
        System.out.println(al);

    }
}
