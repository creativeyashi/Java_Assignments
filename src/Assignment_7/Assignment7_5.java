package Assignment_7;

/*
 * Create a class with an inner class that has a non-default constructor (one that takes arguments).
 * Create a second class with an inner class that inherits from the first inner class.
 */

class Class1{
    static class InnerClass1 {
        InnerClass1(String name){
            System.out.println("InnerClass1: Hello, " + name );
        }
    }
}

class Class2{
    static class InnerClass2 extends Class1.InnerClass1 {
        InnerClass2(String name) {
            super(name);
            System.out.println("InnerClass2: Hello, " + name);
        }
    }
}

public class Assignment7_5 {
    public static void main(String []args){
        Class2.InnerClass2 innerClass2 = new Class2.InnerClass2("Yashi");
    }

}
