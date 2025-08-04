package MultiThreading;

//creating our thread using Runnable Tnterface
public class MyThread implements Runnable{
    public void run(){
//        task for thread...
        for(int i = 0; i<=10; i++){
            System.out.println("Value of i: "+i);
            //wait for 1 sec after printing 1 thread
            try{Thread.sleep(1000);}
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
//        create obj of MyThread class
        MyThread t1 = new MyThread();

        Thread thr = new Thread(t1);
//        starting thread
        thr.start();

        MyThread1 t2 = new MyThread1();

        t2.start();
    }
}
