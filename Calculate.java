/**
  Класс для вычисления суммы двух чисел. Числа берутся извходяшего массива.
*/
public class Calculate {
	public static void main(String[] arg) {
		System.out.println("Calculate...");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		int sum = first + second;
		System.out.println("Sum : " + sum);
	}
}
