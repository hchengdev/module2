import org.junit.jupiter.api.Test;

class TriangleClassifierTest {

    @Test
    public void getTriangleTest1() {
        int a = 2;
        int b = 2;
        int c = 2;

        String getTriangle = TriangleClassifier.getTriangle(a, b, c);
    }
    @Test
    public void getTriangleTest2() {
        int a = 2;
        int b = 2;
        int c = 3;

        String getTriangle = TriangleClassifier.getTriangle(a, b, c);
    }
    @Test
    public void getTriangleTest3() {
        int a = 3;
        int b = 4;
        int c = 5;

        String getTriangle = TriangleClassifier.getTriangle(a, b, c);
    }
    @Test
    public void getTriangleTest4() {
        int a = 8;
        int b = 2;
        int c = 3;

        String getTriangle = TriangleClassifier.getTriangle(a, b, c);
    }
    @Test
    public void getTriangleTest5() {
        int a = -1;
        int b = 2;
        int c = 1;

        String getTriangle = TriangleClassifier.getTriangle(a, b, c);
    }
    @Test
    public void getTriangleTest6() {
        int a = 0;
        int b = 1;
        int c = 1;

        String getTriangle = TriangleClassifier.getTriangle(a, b, c);
    }
}