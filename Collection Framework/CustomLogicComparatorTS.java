package CollectionFramework;
import java.util.*;

class Student1{
    String name;
    int age;

    Student1(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return name+ " - "+age;
    }
}
class NameComparator implements Comparator<Student1>{
    public int compare(Student1 s1, Student1 s2){
        return s1.name.compareTo(s2.name);  //alphabetical order
    }
}
public class CustomLogicComparatorTS {
    public static void main(String[] args) {
        TreeSet<Student1> ts = new TreeSet<>(new NameComparator());
        ts.add(new Student1("Swati", 22));
        ts.add(new Student1("Manav", 23));
        ts.add(new Student1("Kiran", 25));

        for(Student1 s:ts){
            System.out.println(s);
        }
    }
}