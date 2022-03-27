package Assignment_7.Assignment7_4;

interface Cycle {
    void balance();
}

class Unicycle implements Cycle {
    @Override
    public void balance() {
        System.out.println("Balancing Unicycle");
    }
}

class Bicycle implements Cycle {
    @Override
    public void balance() {
        System.out.println("Balancing Bicycle");
    }
}

class Tricycle implements Cycle {
    @Override
    public void balance() {
        System.out.println("Balancing Tricycle");
    }
}

class CycleFactory {
    public Cycle getCycle(String type) {
        if(type==null) return null;
        if(type.equalsIgnoreCase("Unicycle"))
            return new Unicycle();
        if(type.equalsIgnoreCase("Bicycle"))
            return new Bicycle();
        if(type.equalsIgnoreCase("Tricycle"))
            return new Tricycle();
        return null;
    }
}

public class Assignment7_4 {

    public static void main(String []args){
        CycleFactory cycleFactory = new CycleFactory();
        Cycle unicycle = cycleFactory.getCycle("Unicycle");
        Cycle bicycle = cycleFactory.getCycle("Bicycle");
        Cycle tricycle = cycleFactory.getCycle("Tricycle");

        unicycle.balance();
        bicycle.balance();
        tricycle.balance();
    }
}
