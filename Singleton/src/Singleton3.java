//정적멤버로 싱글톤 인스턴스 생성
public class Singleton3 {
    private static Singleton3 instance = null;
    static{
        instance = new Singleton3();
    }
    private static int called = 0;
    private Singleton3(){
        called++;
        System.out.println(called);
    }

    public static Singleton3 getInstance(){
        return instance;
    }
}
