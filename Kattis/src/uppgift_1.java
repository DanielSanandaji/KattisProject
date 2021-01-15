
import java.util.Scanner;

public class uppgift_1 {

	public static void main(String[] args) {

		/*
		 * Let's user enter number and checks the number
		 */
		Scanner scan = new Scanner(System.in);

		// This method reads the number provided using keyboard
		int num = scan.nextInt();

		// Checks the number
		if (num > 500 || num < 1) {
			return;
		}

		String output = "";

		while (num > 0) {
			// kod...

			String first_string = scan.next();
			String second_string = scan.next();
			char[] pair1_1 = first_string.toCharArray();
			char[] pair1_2 = second_string.toCharArray();

			// Condition
			if (pair1_1.length == pair1_2.length) {
				String output2 = "";

				for (int i = 0; i < pair1_1.length; i++) {

					if (pair1_1[i] == pair1_2[i]) {
						output2 += ".";

					} else {
						output2 += "*";

					}
				}

				output +=  first_string + "\n" + second_string + "\n" + output2
						+ "\n" + "\n";

			}
			num--;
			System.out.println();

		}
		System.out.println(output);
		scan.close();

	

	}
}
