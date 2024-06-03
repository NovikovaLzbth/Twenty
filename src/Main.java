import java.util.*;

class Calculator {

    private static Calculator instance = new Calculator();
    private static int x;
    private static int y;
    private Calculator() {
    }

    public static Calculator getInstance() {

        return instance;
    }

    public double calculate(double x, double y) {

        return 2 * x + 3 / y;
    }
}
public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.getInstance();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите x: ");
        double x = scanner.nextInt();
        System.out.print("Введите y: ");
        double y = scanner.nextInt();
        System.out.println("Результат: " + calc.calculate(x, y));
    }
}