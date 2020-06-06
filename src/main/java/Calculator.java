public class Calculator {

    private Integer value = 0;

    public int add(int a, int b) {
        value++;
        return a + b;
    }

    public int substract(int a, int b) {
        value++;
        return a - b;
    }

    public int getValue() {
        return value;
    }
}
