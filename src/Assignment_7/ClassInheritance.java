package Assignment_7;

public class ClassInheritance {
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[3];
        rodents[0] = new Mouse();

        rodents[0].eats();
        rodents[1] = new Gerbil();

        rodents[1].eats();
        rodents[2] = new Hamster();
        rodents[2].eats();
    }

}
 class Gerbil extends Rodent{
    public Gerbil(){
        System.out.println("this is a gerbil");
    }
    @Override
    void eats() {
        System.out.println("Gerbil eats meat only");
    }

}
 class Hamster extends Rodent{
    public Hamster(){
        System.out.println("this is a hamster");
    }
    @Override
    void eats() {
        System.out.println("hamster eats only grass");
    }
}
 class Mouse extends Rodent{
    public Mouse(){
        System.out.println("This is mouse");
    }
    @Override
    void eats() {
        System.out.println("a mouse eats meat and vegetarian foods");
    }
}
abstract class Rodent {
    abstract void eats();

}
