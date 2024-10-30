enum CoffeeType{
    LATTE,
    ESPRESSO,
    AMERICANO,
}

// 추상클래스
abstract class Coffee{
    protected String name;
    public String getName(){
        return name;
    }
}

// 커피 클래스 상속
class Latte extends Coffee{
    // 생성자
    public Latte(){
        name = "latte";
    }
}

// 커피 클래스 상속
class Espresso extends Coffee{
    // 생성자
    public Espresso(){
        name = "Espresso";
    }
}

class Americano extends Coffee{
    public Americano(){name = "Americano";}
}

class CoffeeFactory{
    public static Coffee createCoffee(CoffeeType type){
        switch(type){
            case LATTE :
                return new Latte();
            case ESPRESSO:
                return new Espresso();
            case AMERICANO:
                return new Americano();
            default:
                throw new IllegalArgumentException("Invalid coffee type: " + type);
        }
    }
}

public class FactoryPattern {

    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.createCoffee(CoffeeType.LATTE);
        System.out.println(coffee.getName());
    }
}
