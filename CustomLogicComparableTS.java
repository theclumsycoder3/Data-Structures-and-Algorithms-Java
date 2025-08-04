package CollectionFramework;

import java.util.TreeSet;
import java.sql.SQLOutput;
import java.util.*;

class Student implements Comparable<Student>{
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(Student s){
        return this.age - s.age; //sort in ascending order of age
    }

    public String toString(){
        return name + " - " + age;
    }
}
public class CustomLogicComparableTS {
    public static void main(String[] args) {
            TreeSet<Student> ts = new TreeSet<>();
            ts.add(new Student("Manav", 22));
            ts.add(new Student("Swati", 21));
            ts.add(new Student("Mena",27));

            for (Student s : ts) {
                System.out.println(s);
            }
    }
}

