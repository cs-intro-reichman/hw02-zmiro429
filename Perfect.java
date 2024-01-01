/**
 * Gets a command-line argument (int), and chekcs if the given number is
 * perfect.
 */
public class Perfect {
	public static void main(String[] args) {
		//// Put your code here
		int num = Integer.parseInt(args[0]);
		if (num == Divisors(num)) {
			System.out.print(+num + " is a perfect number since " + num + " = 1");
			for (int i = 2; i <= num; i++) { // started from i=2, so i dont print the number 1 twice
				if (num % i == 0 && num != i) // the use of this if to print the divisors without the number itself
					System.out.print(" + " + i);
			}
		} else
			System.out.println(+num + " is not a perfect number");
	}

	// to see if it`s a perfect number or not
	public static int Divisors(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				sum += i;
		}
		return sum -= num;

	}
}
