
class interruptThread extends Thread {
    @Override 
    public void run() {
        try {
            for(int  i = 1;  i<= 3; i ++) {
                System.out.println("Thread t");
                sleep(1000);
            }
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
    }

    public static void main(String[] args) {
        interruptThread t = new interruptThread();
        t.start();
        t.interrupt();
    }
}