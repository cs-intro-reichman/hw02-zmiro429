/**
 * Generates and prints random integers in the range [0,10),
 * as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main(String[] args) {
		//// Write your code here
		int Before, After = 11;
		Before = (int) ((Math.random() * (10 - 0)) + 0);
		System.out.println(Before);
		Boolean Tester = true;
		while (Tester == true) {
			After = (int) ((Math.random() * (10 - 0)) + 0);
			if (Before > After)
				Tester = false;
			else if (Before < After) {
				System.out.println(After);
				Before = After;
			}

		}
	}
}
