public class Point extends MoveablePoint {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    public Point() {}
    public Point(int x, int y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(int speed) {
        setxSpeed(speed);
        setySpeed(speed);
    }

    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }


    public void setNewX(float speed) {
        float x = this.getxSpeed() + speed;
        this.setX(x);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + this.getX() +
                ", y=" + this.getY() +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    public Point move() {
        this.setNewX(xSpeed);
        this.setNewX(ySpeed);

        return this;
    }
}
