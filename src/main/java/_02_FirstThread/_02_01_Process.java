package _02_FirstThread;

public class _02_01_Process {
    public static void main(String[] args) {
        //this is my process:

        System.out.println("This Process");
        //what we need are:
        //1. a thread
        //2. a job for the thread to do


        //the job:
        Runnable runnable1 = new _02_01_Job(" Job1");
        Runnable runnable2 = new _02_01_Job(" Job2");

        //THREAD:
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        //LETS GO AND START!
        thread1.start(); //non-blocking
        thread2.start();


        //some other mothods to combine:
        //what is cool with streams is that they can be combined with threads:
        Thread thread3 = new Thread(
                () -> {
                    //JOB
                    for (int i = 0; i < 2_000_000_000; i++) { //max int is 2_147_483_647
                        System.out.println("DatumsJob " + new java.util.Date());
                    }
                }
        );
        thread3.start();

        new Thread(
                () -> {
                    for (;;){
                        System.out.println("Hello From the other side...");
                    }
                }
        ).start();
    }
}
