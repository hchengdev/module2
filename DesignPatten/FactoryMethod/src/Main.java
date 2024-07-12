//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal animal = animalFactory.getAnimal("feline");
        System.out.println(animal.makeSound());
        Animal animal2 = animalFactory.getAnimal("canine");
        System.out.println(animal2.makeSound());
    }
}