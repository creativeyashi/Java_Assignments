package Assignment_5.Singleton;

public class Singleton {
    String name;
    public static Singleton method(String name){
        Singleton obj = new Singleton();
        obj.name = name;
        return obj;
    }
    public void getName(){
        System.out.println("Name is : "+name);
    }
}
