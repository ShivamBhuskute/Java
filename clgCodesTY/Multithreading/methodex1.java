// package Multithreading.synchronization;

class methodex extends Thread{
    @Override
    public synchronized void run() {
        String n=Thread.currentThread().getName();
        for(int i=1;i<=3;i++){
            System.out.println(n);
        }
    }
}
public class methodex1{
    public static void main(String[] args) {
        methodex t1=new methodex();
        methodex t2=new methodex();
        methodex t3=new methodex();

        t1.setName("thread1");
        t2.setName("thread2");
        t3.setName("thread3");

        t1.start();
        t2.start();
        t3.start();
    }
}