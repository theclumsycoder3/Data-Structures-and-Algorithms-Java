package Generic;

public class Box<T> {

    //        object class is top most parent class of all java class
    T container;

    public Box(T container){
        this.container = container;
    }

    public void performSomeTask(){
        if(container instanceof String){
            System.out.println("length of "+container+" is " +(((String) this.container).length()));
        }else if(container instanceof Integer){
            System.out.println("This is an integer value" +container);
        }
    }
    public T getValue(){
        return this.container;
    }
    public static void main(String[] args) {

    }
}
