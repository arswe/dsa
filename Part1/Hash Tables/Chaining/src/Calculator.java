import java.util.Collections;

public class Calculator {
    private int result;

    public Calculator(int result) {
        this.result = result;
    }

    public Calculator add(int number) {
        result += number;
        return this;
    }

    public Calculator subtract(int number) {
        result -= number;
        return this;
    }

    public Calculator multiply(int number) {
        this.result *= number;
        return this;
    }

    public Calculator divide(int number) {
        if (number != 0) {
            this.result /= number;
        } else {
            System.out.println("Error: divide by zero");
        }
        return this;
    }

    public int getResult() {
        return result;
    }
}
