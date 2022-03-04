package task5;

public class Singleton1 {
    private static volatile Singleton1 instance;

    public static Singleton1 getInstance(String name) {
        Singleton1 localInstance = instance;
        if (localInstance == null) {//если объект еще не создан
            synchronized (Singleton1.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new Singleton1();
                }
            }
        }
        return localInstance;
    }
}
