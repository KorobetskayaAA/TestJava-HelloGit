import java.util.Scanner;

public class OddMain {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		System.out.println("Введите целое число для проверки на нечетность:");
		if (sc.hasNextInt()) {
			int number = sc.nextInt();
			boolean isOdd = (number % 2 == 1);
			System.out.printf("Число %d %s", number, isOdd ? "нечетное" : "четное");
		}
	}
}