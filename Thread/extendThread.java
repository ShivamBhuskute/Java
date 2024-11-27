// import java.lang.*;

public class extendThread extends Thread {
    public void run() {

        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread");
                Thread.sleep(1000);
            }
        } catch (InterruptedException i) {
            // TODO: handle exception
        }

    }

    public static void main(String[] args) throws InterruptedException {
        extendThread t = new extendThread();
        t.start();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread");
        }
    }
}

// class B {

// }