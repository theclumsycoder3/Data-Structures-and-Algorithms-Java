package MultiThreading;
// Producer Consumer Problem
public class Company {
    int n;
    boolean f = false;
//    f=false : chance : Producer
//    f:true : chance : consumer
    synchronized public void produce_item(int n){
        if(f){
            try{wait();}catch(Exception e){
                e.getMessage();
            }
        }
        this.n = n;
        System.out.println("Produced : "+this.n);
        f = true;
        notify();
    }
    synchronized public int consume_item(){
        if(!f){
            try{wait();}catch(Exception e){
                e.getMessage();
            }
        }
        System.out.println("Consumed : "+this.n);
        f = false;
        notify();
        return this.n;
    }
}
