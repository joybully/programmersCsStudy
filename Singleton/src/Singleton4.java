public class Singleton4 {
    private static int called=0;
    Singleton4(){
        called++;
        System.out.println(called);
    }
    private static class singleInstanceHolder{
        private static final Singleton4 INSTANCE = new Singleton4();
    }
    public static Singleton4 getInstance(){
        return singleInstanceHolder.INSTANCE;
    }
}
