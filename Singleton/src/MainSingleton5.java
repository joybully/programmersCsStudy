class MainSingleton5 {
    public static void main(String[] args) {
        // Singleton5
        Singleton5 a = Singleton5.getInstance();
        Singleton5 b = Singleton5.getInstance();
        if(a.hashCode()==b.hashCode()) System.out.println("Singleton5 is a singleton class.");
    }
}
