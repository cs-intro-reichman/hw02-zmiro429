
/**
 * Simulates the formation of a family in which the parents decide
 * to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main(String[] args) {
		//// Put your code here
		int number, sum = 0, m = 1;
		boolean boy = false, girl = false;
		while (m == 1) {
			number = (int) ((Math.random() * (10 - 0)) + 0);
			if (number % 2 == 0) {
				girl = true;
				System.out.print("g ");
				sum++;
			} else {
				boy = true;
				System.out.print("b ");
				sum++;
			}
			if (boy == true && girl == true)
				m = 0;
		}
		System.out.println("");
		System.out.print("You made it... and you now have " + sum + " children.");
	}
}
