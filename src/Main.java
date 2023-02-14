public class Main {
    static class Ronolado implements Runnable{ //making a new thread
        @Override
        public void run() {
            for(int i=0;i<5;i++) {
                System.out.println("Ronaldo");
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }



    }
    public static void main(String[] args) throws InterruptedException {
        Ronolado r = new Ronolado();
        Thread t = new Thread(r);   //syntax of new thread using implement interface
        t.start();

        for(int i=0; i<5; i++)
            System.out.println("Messi");
        Thread.sleep(1);

    }
}