public class Main {
    public static void main(String[] args) {
        var calculator = new Calculator(0);
        var finalResult = calculator
                .add(4)
                .multiply(2)
                .divide(2)
                .subtract(2)
                .getResult();
        System.out.println(finalResult);
    }
}