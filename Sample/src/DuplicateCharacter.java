import java.util.Scanner;

public class DuplicateCharacter {

	static void duplicateCharacter(String stringName) {
		char[] character = stringName.toCharArray();
		for(int i = 0; i < stringName.length(); i++) {
			for (int j = i + 1; j < stringName.length(); j++ ) {
				if(character[i] == character[j]) {
					System.out.println();
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String stringName = scanner.nextLine();
	}

}
