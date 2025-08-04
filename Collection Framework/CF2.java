package CollectionFramework;

import java.util.HashSet;
import java.util.TreeSet;

public class CF2 {
    public static void main(String[] args) {
//        primitive datatypes do not work here
//        Objects work!
        HashSet<Double> nms= new HashSet<>();

//        Java automatically converts 14.14 → new Double(14.14) using autoboxing
        nms.add(14.14);
        nms.add(34.56);
        nms.add(6574.55);
        nms.add(344.5);

        System.out.println(nms);

        TreeSet<Double> tset = new TreeSet<>();
        tset.addAll(nms);
        System.out.println(tset);
    }
}
