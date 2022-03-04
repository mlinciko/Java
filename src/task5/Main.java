package task5;

public class Main {
    public static void main(String[] args){
        //создадим объект класса Singleton1
        Singleton3 object2 = new Singleton3();
        //object2.setName("Second object");

        //попытаемся создать еще один объект класса Singleton1
        Singleton3 object3 = new Singleton3();
        //object3.setName("test");

        System.out.println(object2);//.getName());
        System.out.println(object3);//.getName());
    }
}


