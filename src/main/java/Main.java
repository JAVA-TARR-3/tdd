import static package1.StaticCalculator.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello, World!");

        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1, 2));

        System.out.println(add(1 ,2));
    }
}
