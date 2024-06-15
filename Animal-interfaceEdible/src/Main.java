import Fruit.Apple;
import Fruit.Fruit;
import animal.Animal;
import animal.Chicken;
import animal.Tiger;
import Fruit.Fruit;
import Fruit.Orange;
import Fruit.Apple;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2] ;
        animals[0] = new Chicken();
        animals[1] = new Tiger();
        for (Animal animal : animals) {
            System.out.println(animal.suond());
        }

        Fruit[] fr = new Fruit[2] ;
        fr[0] = new Apple();
        fr[1] = new Orange();
        for (Fruit fruit : fr) {
            System.out.println(fruit.howToEat());
        }
    }
}