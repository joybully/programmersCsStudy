//정적멤버로 싱글톤 인스턴스 생성
public class Singleton2 {
    private final static Singleton2 instance = new Singleton2();
    private static int called = 0;
    private Singleton2(){
        called++;
        System.out.println(called);
    }

    public static Singleton2 getInstance(){
        return instance;
    }
}
