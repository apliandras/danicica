package danicica;

public class Fibonacci {

    public Fibonacci() {
    }

    public int calculate(int index) {
        if (index == 1 || index == 2) {
            return 1;
        }
        return calculate(index - 1) + calculate(index - 2);
    }
}
