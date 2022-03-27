package Assignment_7;

class Cycle {
    void balance() {
        System.out.println("Balancing Cycle");
    }
}

class Unicycle extends Cycle {
    @Override
    void balance() {
        System.out.println("Balancing Unicycle");
    }
}

class Bicycle extends Cycle {
    @Override
    void balance() {
        System.out.println("Balancing Bicycle");
    }
}

class Tricycle extends Cycle {

}

public class Assignment7_2 {
    public static void main(String []args) {
        Cycle unicycle = new Unicycle();
        Cycle bicycle = new Bicycle();
        Cycle tricycle = new Tricycle();
        unicycle.balance();
        bicycle.balance();
        tricycle.balance();

        Unicycle unicycle1 = (Unicycle) unicycle;
        Bicycle bicycle1 = (Bicycle) bicycle;
        Tricycle tricycle1 = (Tricycle) tricycle;
        unicycle1.balance();
        bicycle1.balance();
        tricycle1.balance();
    }

}
