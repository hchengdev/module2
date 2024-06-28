public class TriangleUtils {
    public static void validateTriangle(double a, double b, double c) throws IllegalTriangleException {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException("Các cạnh phải là số dương.");
        }
        if(a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Tổng của hai cạnh phải lớn hơn cạnh còn lại.");
        }
    }
}
