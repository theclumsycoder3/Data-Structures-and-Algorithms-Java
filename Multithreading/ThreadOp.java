package MultiThreading;

class UserThread extends Thread{
    public void run(){
//        task for thread
        System.out.println("This is user defined thread");
    }
}
public class ThreadOp {
    public static void main(String[] args) {
        System.out.println("Program started...");
        int x = 56+34;
        System.out.println("sum is "+x);
//      Thread...
        Thread t = Thread.currentThread();
        String tname = t.getName();
        System.out.println("Current running thread is: "+tname);

//        setName
        t.setName("MyMain");
        System.out.println(t.getName());

        try{Thread.sleep(5000);}catch(Exception e){
            e.getMessage();
        }

        System.out.println(t.getId());

//        going to start user defined thread
        UserThread thread = new UserThread();
        thread.start();

        System.out.println("Program ended...");
    }
}
