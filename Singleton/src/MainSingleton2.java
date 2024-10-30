public class MainSingleton2 {
    public static void main(String[] args) {
        // Singleton2
        int start = (int)System.currentTimeMillis();
        for(int i =0;i<100;i++){
            new Thread(() -> {
                Singleton2 a = Singleton2.getInstance();
                long sleep = (long)(Math.random()*100);
                try {
                    Thread.sleep(sleep);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            ).start();
        }

        for(int i=0;i<100;i++){
            new Thread(() -> {
                Singleton2 b = Singleton2.getInstance();
                long sleep = (long)(Math.random()*100);
                try {
                    Thread.sleep(sleep);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }).start();
        }
        int end = (int)System.currentTimeMillis();
        //System.out.println(end-start);
    }
}
