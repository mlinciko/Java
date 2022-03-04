package task5;

public class Singleton3 {
//    private String name;
    private Singleton3 instance;
    public synchronized Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
            return instance;
        }
        return instance;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
}
