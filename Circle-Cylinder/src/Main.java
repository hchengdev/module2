//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle cr = new Circle(10 ,"red");
        System.out.println(cr.getArea());

        Circle cr2 = new Cylinder(20 ,"red", 14);
        Cylinder cr3 = (Cylinder) cr2;
        System.out.println(Math.ceil(cr3.getvolume()));
    }
}