package Assignment_6;

class Constructordemo
{
     Constructordemo(String name)
    {
        System.out.println(name);
    }
}
public class ConstructorDemo2 {

    public static void main(String[] args) {
        Constructordemo obj = new Constructordemo("YASHIKA");
        Constructordemo[] arrayOfObject =new Constructordemo[2];
        arrayOfObject[0] = new Constructordemo("GUPTA");
        arrayOfObject[1] = new Constructordemo("HELLO WORLD");
    }
}