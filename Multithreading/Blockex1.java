// package Multithreading.synchronization;

class Blockex extends Thread{
    public void run() {
        String n=Thread.currentThread().getName();
        for(int i=1;i<=3;i++){
            System.out.println(n+" -Unsynchronized loop iteration");
        }
//        System.out.println("1st for loop executed");
        synchronized (this){
            for(int i=1;i<=3;i++){
                System.out.println(n+" -Synchronized loop iteration");
            }
        }
    }
}
public class Blockex1{
    public static void main(String[] args) {
        Blockex t1=new Blockex();
        Blockex t2=new Blockex();
        Blockex t3=new Blockex();

        t1.setName("Thread1");
        t2.setName("Thread2");
        t3.setName("Thread3");

        t1.start();
        t2.start();
        t3.start();
    }
}