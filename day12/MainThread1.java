public class MainThread1 {
    public static void main(String[] args) {
        ChildThread1 ct1 = new ChildThread1();

        ct1.start();
        System.out.println("Child thread state: " + ct1.getState());
        for (int i = 0; i < 5; i++) {
            System.out.println("mainthread1");
        }
    }

    static class ChildThread1 extends Thread {
        // start
        // run
        
        public void run() {
            Thread.yield();
            for (int i = 0; i < 5; i++) {
                System.out.println("child thread " + i);
            }
        }
    }
}