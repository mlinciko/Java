package task5;

public class Singleton2 {
    private String name;
    public static final Singleton2 INSTANCE = new Singleton2();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
