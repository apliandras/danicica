package danicica;

public class Main {

    public static void main(String[] args) {
        //call fibonacci method:
        System.out.println("-----------------------------");
        System.out.println(fibonacci(3));

        //create a new dog
        System.out.println("-----------------------------");
        Dog kutya1 = new Dog("Bodri");
        Dog kutya2 = new Dog("Steve");

        System.out.println("kutya1 says:");
        kutya1.bark();

        System.out.println("kutya2 says:");
        kutya2.bark();

        //Call static method
        System.out.println("-----------------------------");
        Dog.shortDescription();

        //Calculate Fibonacci number with custom class
        System.out.println("-----------------------------");
        Fibonacci fibonacci = new Fibonacci();
        int fibonacciNumber = fibonacci.calculate(10);
        System.out.println(fibonacciNumber);
    }

    private static int fibonacci(int index) {
        if (index == 1 || index == 2) {
            return 1;
        }
        return fibonacci(index - 1) + fibonacci(index - 2);
    }

}
