public class TriangleUtils {
    public static void validateTriangle(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0) {
            throw new IllegalTriangleException("Cạnh thứ nhất phải là số dương.");
        }
        if (b <= 0) {
            throw new IllegalTriangleException("Cạnh thứ hai phải là số dương.");
        }
        if (c <= 0) {
            throw new IllegalTriangleException("Cạnh thứ ba phải là số dương.");
        }
        if (a + b <= c) {
            throw new IllegalTriangleException("Tổng của cạnh thứ nhất và thứ hai phải lớn hơn cạnh thứ ba.");
        }
        if (a + c <= b) {
            throw new IllegalTriangleException("Tổng của cạnh thứ nhất và thứ ba phải lớn hơn cạnh thứ hai.");
        }
        if (b + c <= a) {
            throw new IllegalTriangleException("Tổng của cạnh thứ hai và thứ ba phải lớn hơn cạnh thứ nhất.");
        }
    }
}
