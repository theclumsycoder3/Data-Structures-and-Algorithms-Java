package Generic;

import java.sql.SQLOutput;

public class Example {
    public static void main(String[] args) {
//        Box box = new Box("water");
//        box.container = 123;
//        System.out.println(box.getValue());

        Box<String> box = new Box<String>("Wow this is amazing");
        System.out.println(box.getValue());
        System.out.println(box.container.getClass().getName());
        box.container = "subscribe to youtube channel";
        box.performSomeTask();

        System.out.println("_____________________________________");

        Box<Integer> box1 = new Box<>(123);
        System.out.println(box1.getValue());
        System.out.println(box1.container.getClass().getName());
        box1.container = 123;
        box1.performSomeTask();


        System.out.println("_____________________________________");

        Box<Boolean> box2 = new Box<>(true);
        System.out.println(box2.getValue());
    }
}
