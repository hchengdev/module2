public class ShapeFactory {
    public static Shape createShape(String shapeType, double... parameters) {
        switch (shapeType.toLowerCase()) {
            case "circle":
                if (parameters.length == 1) {
                    return new Circle((int) parameters[0]);
                } else {
                    throw new IllegalArgumentException("Circle requires 1 parameter: radius");
                }
            case "rectangle":
                if (parameters.length == 2) {
                    return new Rectangle((int) parameters[0], (int) parameters[1]);
                } else {
                    throw new IllegalArgumentException("Rectangle requires 2 parameters: width and height");
                }
            case "square":
                if (parameters.length == 1) {
                    return new Square((int) parameters[0]);
                } else {
                    throw new IllegalArgumentException("Square requires 1 parameter: side length");
                }
            default:
                throw new IllegalArgumentException("Unknown shape type");
        }
    }
}
