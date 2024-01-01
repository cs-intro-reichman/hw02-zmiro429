/**
 * Computes some statistics about families in which the parents decide
 * to have children until they have at least one child of each gender.
 * The program expects to get one command-line argument: an int value
 * that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main(String[] args) {
		int randomizer, sum = 0, m = 1, sumf1 = 0, sumf2 = 0, sumf4 = 0;
		double ttries = Integer.parseInt(args[0]), sumchild = 0;
		boolean boy = false, girl = false;
		for (int i = 0; i < ttries; i++) {
			while (m == 1) {
				randomizer = (int) ((Math.random() * (10 - 0)) + 0);
				if (randomizer % 2 == 0) {
					girl = true;
					sum++;
				} else {
					boy = true;
					sum++;
				}
				if (boy == true && girl == true)
					m = 0;
			}
			m = 1;
			sumchild += sum;
			boy = false;
			girl = false;
			if (sum == 2)
				sumf1++;
			else if (sum == 3)
				sumf2++;
			else
				sumf4++;
			sum = 0;
		}
		System.out.println("Average: " + sumchild / ttries + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + sumf1);
		System.out.println("Number of families with 3 children: " + sumf2);
		System.out.println("Number of families with 4 or more children: " + sumf4);
		Printer(sumf1, sumf2, sumf4);
	}

	// this is for which is the bigger number of families
	public static void Printer(int sumf1, int sumf2, int sumf4) {
		if (sumf1 > sumf2)
			System.out.println("The most common number of children is 2.");
		else if (sumf2 > sumf1)
			System.out.println("The most common number of children is 3.");
		else if (sumf2 > sumf4)
			System.out.println("The most common number of children is 3.");
		else
			System.out.println("The most common number of children is 4 or more.");
	}
}
