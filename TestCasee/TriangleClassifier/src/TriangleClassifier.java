public class TriangleClassifier {
    public static String getTriangle(int a, int b, int c) {
        if (a + b <= c || b + c <= a || c + a <= b) {
            return "Khong phai la tam giac";
        }
        if (a <= 0 || b <= 0 || c <= 0) {
            return "Khong phai la tam giac";
        }
        if (a == b && b == c) {
            return "La tam giac deu";
        }
        if (a == b || b == c || c == a) {
            return "La tam giac can";
        }
        return "La tam giac thuong";
    }
}
