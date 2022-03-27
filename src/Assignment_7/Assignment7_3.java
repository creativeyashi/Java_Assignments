package Assignment_7;



/*
 * Create three interfaces, each with two methods. Inherit a new interface that combines the three, adding a new method.
 * Create a class by implementing the new interface and also inheriting from a concrete class. Now write four methods,
 * each of which takes one of the four interfaces as an argument. In main( ), create an object of your class and pass it to each of the methods.
 *
 */

interface Interface1 {
    void method1();
    void method2();
}

interface Interface2 {
    void method3();
    void method4();
}

interface Interface3 {
    void method5();
    void method6();
}

interface Interface4 extends Interface1, Interface2, Interface3 {
    void method7();
};

class ConcreteClass{
    void method8(){
        System.out.println("Method 8");
    }
}

public class Assignment7_3 extends ConcreteClass implements Interface4 {

    public void method1() {
        System.out.println("Interface 1 Method 1");
    }
    public void method2() {
        System.out.println("Interface 1 Method 2");
    }
    public void method3() {
        System.out.println("Interface 2 Method 3");
    }
    public void method4() {
        System.out.println("Interface 2 Method 4");
    }
    public void method5() {
        System.out.println("Interface 3 Method 5");
    }
    public void method6() {
        System.out.println("Interface 3 Method 6");
    }
    public void method7() {
        System.out.println("Interface 4 Method 7");
    }

    public void method10(Interface1 object){
        object.method1();
        object.method2();
    }
    public void method11(Interface2 object){
        object.method3();
        object.method4();
    }
    public void method12(Interface3 object){
        object.method5();
        object.method6();
    }
    public void method13(Interface4 object){
        object.method7();
    }

    public static void main(String[] args){
        Assignment7_3 assignment7_3 = new Assignment7_3();
        assignment7_3.method10(assignment7_3);
        assignment7_3.method11(assignment7_3);
        assignment7_3.method12(assignment7_3);
        assignment7_3.method13(assignment7_3);
    }


}