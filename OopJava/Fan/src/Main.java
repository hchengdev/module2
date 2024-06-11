//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan(Fan.FAST, true, 10, "yellow" );
        Fan fan2 = new Fan(Fan.MEDIUM, false, 5, "blue" );
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}