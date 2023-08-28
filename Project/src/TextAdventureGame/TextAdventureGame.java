package TextAdventureGame;

import java.util.Random;
import java.util.Scanner;

public class TextAdventureGame {
	static Scanner sc = new Scanner(System.in);
	static Random random = new Random(100);

	public static void main(String[] args) {
		System.out.println("Welcome to the lost city of Eldoria!");
		System.out.println("What do you want to do?");
		System.out.println("1.Enter the jungle");
		System.out.println("2.Quit the game");
		System.out.println("Enter an option: ");
		int option = sc.nextInt();
		// Gaming loop starts here
		while (option != 0) {
			switch (option) {
			case 1:
				System.out.println("You have entered into the forest!");
				System.out.println("What do you want to do?");
				System.out.println("1.Go deeper into the forest");
				System.out.println("2.Quit the game");
				int option1 = sc.nextInt();
				while (option1 != 0) {
					switch (option1) {
					case 1:
//						System.out.println("You choosed an option to go into the forest!");
						int choice = random.nextInt(100);
						if (choice < 40) {
							System.out.println("You encountered a wild animal!");
							// encounters starts here
							// wild animal encounter
							wildAnimal_Encounter();
							break;
						} else if (choice < 70) {
							System.out.println("You encountered a environmental hazard");
							// environmental hazard encounter
							environmental_Hazard();
							break;
						} else {
							// treasure box encounter
							treasure_Box();
						}
						break;
					case 2:
						System.out.println("You choosed an option to quit the game");
						break;
					}

				}
				break;

			default:
				System.out.println("please enter a valid option?");
			}
		}
	}

	// treasure box game implementation
	private static void treasure_Box() {
		System.out.println("You found a treasure box!");
		System.out.println("What do you want to do?");
		System.out.println("1.open ");
		System.out.println("2.Leave");
		System.out.println("3.Quit the game");
		int option = sc.nextInt();
		switch (option) {
		case 1:
			System.out.println(random.nextInt(1000));
			System.out.println("You found gold coins");
			break;
		case 2:
			System.out.println("You found a empty box");
			break;
		case 3:
			System.out.println("You quit the game");
			System.out.println("Thank You For Playing!");
			System.exit(0);
		}

	}

	// environmental hazard implementation
	private static void environmental_Hazard() {
		System.out.println("Do you want to continue playing?");
		int hazardType = random.nextInt(100);
		int dodgeChance = random.nextInt(100);
		if (hazardType < 40) {
			// Quick Sand
			System.out.println("You encounter quicksand!");
			int escapeChance = random.nextInt(100);
			if (escapeChance < 50) {
				System.out.println("You manage to escape the quicksand.");
			} else {
				System.out.println("You sink into the quicksand");
				System.exit(0);
			}
		} else if (hazardType < 70) {
			// Falling Trees
			System.out.println("You encounter falling trees!");
			int dodgeChance1 = random.nextInt(100);
			if (dodgeChance1 < 70) {
				System.out.println("You successfully dodge the falling trees.");
			} else {
				System.out.println("You get hit by falling trees and take");
			}
		} else {
			// Poisonous Plants
			System.out.println("You come across poisonous plants!");
			int consumeChance = random.nextInt(100);
			if (consumeChance < 100) {
				System.out.println("You wisely avoid consuming the poisonous plants.");
			} else {
				System.out.println("You consume the poisonous plants and take");
			}
		}

	}

	// wild animal encounter implementation
	private static void wildAnimal_Encounter() {
		System.out.println("What do you want to do?");
		System.out.println("1.Attack");
		System.out.println("2.Run");
		System.out.println("3.Quit the game");
		int option = sc.nextInt();
		if (option == 1) {
			attack();
		} else if(option == 2){
			run();
		}
		else {
			System.out.println("You quit the game");
			System.out.println("Thank you for playing!");
			System.exit(0);
		}
	}

	// run method implementation in wild animal attack
	private static void run() {
		int escape_chance = random.nextInt(100);
		if (escape_chance < 50) {
			System.out.println("You escaped and reached a safe spot");
		} else {
			System.out.println("You tried to escape but it not worked");
			System.out.println("You have taken a damage token");
		}
	}

	// attack method implementation in wild animal attack
	private static void attack() {
		int playerHealth = random.nextInt(100);
		if (playerHealth < 50) {
			System.out.println("Animal wins");
		} else {
			System.out.println("You win");
			System.out.println("continue playing");
		}

	}
}
