/**
 * Prints a given string, backward. Then prints the middle character in the
 * string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main(String[] args) {
		//// Put your code here
		String word = args[0];
		int x = word.length() - 1;
		for (int i = 0; i < word.length(); i++) {
			System.out.print(word.charAt(x));
			x--;
		}
		System.out.println("");
		System.out.println("The middle character is " + word.charAt(word.length() / 2));
	}
}
