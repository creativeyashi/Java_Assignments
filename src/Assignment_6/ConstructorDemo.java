package Assignment_6;

class OverloadingDemo{
    public  OverloadingDemo()
    {
        new OverloadingDemo(8);
    }
    public OverloadingDemo(Integer a)
    {
        System.out.println(a);
    }
}
public class ConstructorDemo
{
    public static void main(String[] args) {
        OverloadingDemo obj = new OverloadingDemo();
    }
}