package com.bridgelabz;

import java.util.Random;

public class PlayerScore {

		static void playerScore(int randomNumber) {
			Random random = new Random();
			for(int i = 1; i < 7; i++) {
				 randomNumber = random.nextInt(6);
			System.out.println(randomNumber);
//			System.out.println("2nd ball " +randomNumber);
//			System.out.println("3rd ball " +randomNumber);
//			System.out.println("4th ball " +randomNumber);
//			System.out.println("5th ball " +randomNumber);
//			System.out.println("6th ball " +randomNumber);

			}
			int totalScore = random.nextInt(6);
			System.out.println(totalScore);
		}
	public static void main(String[] args) {
		int randomNumber = 0;
		playerScore(randomNumber);
	}

}
