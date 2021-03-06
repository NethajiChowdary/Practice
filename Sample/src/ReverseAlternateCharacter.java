import java.util.Scanner;

public class ReverseAlternateCharacter {
	static String reverse(String stringName, int start, int end) {
		if (start == end) {
			return "";
		}
		String result = " ";
		for (int i = start; i <= end; i++) {
			result = stringName.charAt(i) + result;
		}
		return result;
	}

	static String reverseAlternateCharacter(String stringName, int k) {
		if (k <= 0 || stringName.length() <= 0) {
			return stringName;
		}
		String result = " ";
		int counter = 0;
		for (int i = 0; i < stringName.length(); i++) {
			if (counter == 0 && i <= stringName.length() - k) {
				result += reverse(stringName, i, i + (k - 1));
				counter = k;
				i = i + (k - 1);
			} else {
				counter--;
				result += stringName.charAt(i);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String stringName = scanner.nextLine();
		System.out.println("Enter the value for k as a positive integer: ");
		int k = scanner.nextInt();
		System.out.println(reverseAlternateCharacter(stringName, k));
		scanner.close();
	}

}
