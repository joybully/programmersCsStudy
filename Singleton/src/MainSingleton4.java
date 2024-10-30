class MainSingleton4 {
    public static void main(String[] args) {
        // Singleton4
        int start = (int)System.currentTimeMillis();
        for(int i =0;i<100;i++){
            new Thread(() -> {
                Singleton4 a = Singleton4.getInstance();
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
                Singleton4 b = Singleton4.getInstance();
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
