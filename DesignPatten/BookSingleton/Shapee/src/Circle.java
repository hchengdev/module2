import java.awt.*;

public class Circle implements Shape{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        int diameter = (int) (2 * radius);
        g.drawOval(50, 50, diameter, diameter);
    }
}
