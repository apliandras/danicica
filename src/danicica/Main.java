package danicica;

public class Main {

	public static void main(String[] args) {
		int fibo=fibonacci(44);
		System.out.println(fibo);
		kutya kutya1= new kutya("Bodri");
		kutya kutya2= new kutya("Steve");
		kutya1.bark();
		System.out.println(" ");
		kutya2.bark();
	}
private static int fibonacci(int index) {
	if(index==1||index==2) {
		return 1;
	}
	return fibonacci(index-1)+fibonacci(index-2);
}
}
