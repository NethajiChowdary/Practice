import java.util.HashSet;
import java.util.Scanner;

public class FirstDuplicateCharacter {

	static char firstDuplicateCharacter(char stringName[]) {
		HashSet<Character> character = new HashSet<>();
		for (int i =0; i <= stringName.length -1; i++)
		{
			char c = stringName[i];
			if(character.contains(c))
				return c;
			else
				character.add(c);
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String stringName = scanner.nextLine();
		char[] array = stringName.toCharArray();
		System.out.println(firstDuplicateCharacter(array));
		scanner.close();
	}

}
