class MainSingleton6 {
    public static void main(String[] args) {
        // Singleton6
        Singleton6 a = Singleton6.INSTANCE;
        Singleton6 b = Singleton6.INSTANCE;
        if(a.hashCode()==b.hashCode()) System.out.println("Singleton6 is an enum.");
    }
}
