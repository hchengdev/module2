import org.junit.jupiter.api.Test;

class NextDayCalculatorTest {

    @Test
    void getNextDay1() {
        int day = 1;
        int month = 1;
        int year = 2018;

        int[] nextDay = NextDayCalculator.getNextDay( day, month, year);
    }
    @Test
    void getNextDay2() {
        int day = 31;
        int month = 1;
        int year = 2018;

        int[] nextDay = NextDayCalculator.getNextDay( day, month, year);
    }
    @Test
    void getNextDay3() {
        int day = 30;
        int month = 4;
        int year = 2018;

        int[] nextDay = NextDayCalculator.getNextDay( day, month, year);
    }
    @Test
    void getNextDay4() {
        int day = 28;
        int month = 2;
        int year = 2018;

        int[] nextDay = NextDayCalculator.getNextDay( day, month, year);
    }
    @Test
    void getNextDay5() {
        int day = 29;
        int month = 2;
        int year = 2020;

        int[] nextDay = NextDayCalculator.getNextDay( day, month, year);
    }
    @Test
    void getNextDay6() {
        int day = 31;
        int month = 12;
        int year = 2018;

        int[] nextDay = NextDayCalculator.getNextDay( day, month, year);
    }
}