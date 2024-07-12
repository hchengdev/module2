import java.awt.*;

public class Square implements Shape {
    private int x;

    public Square(int x) {
        this.x = x;
    }

    @Override
    public void draw(Graphics g) {
        g.drawRect(50, 50, (int) x, (int) x);
    }
}
