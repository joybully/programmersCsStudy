public class MainSingleton1 {
    public static void main(String[] args) {
        for(int i =0;i<100;i++){
            new Thread(() -> {
                Singleton1 a = Singleton1.getInstance();
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
                Singleton1 b = Singleton1.getInstance();
                long sleep = (long)(Math.random()*100);
                try {
                    Thread.sleep(sleep);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }).start();
        }
    }
}
