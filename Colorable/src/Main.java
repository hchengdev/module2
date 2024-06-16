//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3, "#000", true);
        System.out.println("Circle: " + circle.toString());
        circle.setColor("#fff");
        System.out.println("New Circle: " + circle.toString());
    }
}