/**
 * Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		Draw(number);
		// if the number is odd to print the last row
		if (number % 2 == 1)
			for (int j = 0; j < number; j++) {
				System.out.print("* ");
			}
	}

	// Drawing of the Damka Board
	public static void Draw(int number) {
		for (int i = 0; i < number / 2; i++) {
			for (int j = 0; j < number; j++) {
				System.out.print("* ");
			}
			System.out.println("");
			for (int m = 0; m < number; m++) {
				System.out.print(" *");
			}
			System.out.println("");
		}
	}
}
