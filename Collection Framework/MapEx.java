package CollectionFramework;

import java.util.HashMap;

public class MapEx {
    public static void main(String[] args) {
        HashMap<String, Integer> courses = new HashMap<>();

//        adding ele
        courses.put("Core Java", 4000);
        courses.put("Basic Python", 3500);
        courses.put("Spring", 8000);
        courses.put("Android", 4000);
        courses.put("Android", 6000);
        courses.put("PHP", 2414);

        System.out.println(courses);

        /*courses.forEach((e1,e2)->{
            System.out.println(e1+"=>"+e2);
        }); */
//OR
        courses.forEach((key,value)->{
            System.out.print(key);
            System.out.print("=>");
            System.out.println(value);
            System.out.println();
        });

//        retrive value - entry set
//                        key set

        System.out.println(courses.get("Core Java"));



    }
}
