// package Multithreading;

class UsingInterfaceEx implements Runnable{
    @Override
    public void run() {
        for (int i=1;i<=5;i++){
            System.out.println("child thread");
        }
    }
}
public class Runnable1{
    public static void main(String[] args) {
        UsingInterfaceEx u=new UsingInterfaceEx();
        Thread t=new Thread(u);
        t.start();

        String n = Thread.currentThread().getName();
        for (int i=1;i<=5;i++){
            // System.out.println("main thread");
            System.out.println(n);
        }
    }
}
