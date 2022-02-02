import java.util.Scanner;

public class PrimeNumber
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		int [] array = new int [size];
		System.out.println("Enter the elements of array");
		for (int i =1; i < size; i++)
		{
			array[i] = scanner.nextInt();
		}
		scanner.close();
		for (int i = 0; i<array.length; i++) {
		for (int j = 2; j < i; j++) {
			if (i%j == 0) {
				break;
			}
		
			System.out.println("The prime numbers in the array are: "+i);
		}
		}
	}
}
 