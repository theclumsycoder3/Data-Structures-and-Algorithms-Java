package MultiThreading;

public class MyThread1 extends Thread{
    public void run(){
//        task for thread
        for(int i = 10; i>=0 ; i--){
            System.out.println("Another Thread = "+i);
            try{MyThread1.sleep(2000);}
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

}
