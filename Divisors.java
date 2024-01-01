/**
 * Gets a command-line argument (int), and prints all the divisors of the given
 * number.
 */
public class Divisors {
	public static void main(String[] args) {
		//// Put your code here
		int num = Integer.parseInt(args[0]);
		// we use a for loop to check if the number divisors.
		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				System.out.println(i);
		}
	}
}
