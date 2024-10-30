//싱글톤 인스턴스 매서드 호출
public class Singleton1 {
    private static int called = 0 ;
    private static Singleton1 instance;

    private Singleton1(){
        called++;
        System.out.println(called);
    }

    public static Singleton1 getInstance(){
        if(instance == null){
            instance = new Singleton1();
        }
        return instance;
    }
}
