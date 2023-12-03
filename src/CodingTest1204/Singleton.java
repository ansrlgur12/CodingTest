package CodingTest1204;

public class Singleton {
    private Singleton() {}

    public static Singleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    public static class LazyHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
}
