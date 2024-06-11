public class Fan {
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;
    int speed;
    boolean on;
    double radius;
    String color;
    public  Fan() {}
    public Fan(boolean on, double radius, String color) {
        this.speed = SLOW;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if(this.isOn()) {
            return "Fan {" +
                    "speed =v" + speed +
                    ", on = " + on +
                    ", radius = " + radius +
                    ", color = '" + color + '\'' +
                    '}';
        } else {
            System.out.printf("fan is off: ");
            return "Fan {" +
                    "radius = " + radius +
                    ", color = '" + color + '\'' +
                    '}';
        }
    }
}
