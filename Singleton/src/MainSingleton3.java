class MainSingleton3 {
    public static void main(String[] args) {
        //Singleton3
        int start = (int)System.currentTimeMillis();
        for(int i =0;i<100;i++){
            new Thread(() -> {
                Singleton3 a = Singleton3.getInstance();
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
                Singleton3 b = Singleton3.getInstance();
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
