package Assignment_5.Main;

import Assignment_5.Data.Encapsulate;
import Assignment_5.Singleton.Singleton;

public class Main {

    public static void main(String[] args) {
        Encapsulate encapsulate = new Encapsulate();
        encapsulate.getValues();
        encapsulate.getLocal();
        Singleton singleton = Singleton.method("Yashika");
        singleton.getName();
    }

}
