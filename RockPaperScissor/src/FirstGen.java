import java.util.Scanner;
import java.util.Random;

public class FirstGen {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int again = 1, computerWon = 0, humanWon = 0;
		String humanName = getsHumanName(console);
		
		while (again == 1) {
			console.nextLine();

			scoreBoard(console, humanWon, computerWon, humanName);

			String humanChoice = console.next();
			console.nextLine();
			String computerChoice = choiceGen();
			
			humanChoice = humanChoice.toLowerCase();
			computerChoice = computerChoice.toLowerCase();
			
			int[] results = winDrawLossOrError(computerChoice, humanChoice, humanWon, computerWon);
	        humanWon = results[0];
	        computerWon = results[1];

	        again = playAgain(console);
		}
	} 
	// Welcomes the player by asking the name and tells the rules of the game.
	public static String getsHumanName(Scanner console) {
		System.out.println("Welcome! Please state your name in order to play. ");
		System.out.print("Name: ");
		String humanName = console.nextLine();
		System.out.print(humanName);
		System.out.println(" please press enter to start");
		System.out.println();
		return humanName;
	}
	// Gives the score board.
	public static void scoreBoard(Scanner console, int humanWon, int computerWon, String humanName) {
		System.out.println("(Score Board)");
		System.out.println("You: " + humanWon + ", Computer = " + computerWon);
		System.out.println();
		System.out.println("Hello " + humanName + ", "
				+ "please pick between rock, paper, and scissors. (Only the first word counts) ");
		System.out.print("Your Choice: ");
		String humanChoice = console.next();
		console.nextLine();
		String computerChoice = choiceGen();
	}

	// Calculate the possibility and tells you your results.
	public static int[] winDrawLossOrError(String computerChoice, String humanChoice, int humanWon, int computerWon) {
		int[] results = new int[2];
		if (computerChoice.equals("rock") && humanChoice.equals("rock")) {
			System.out.println();
			System.out.println("Computer chose rock.");
			System.out.println("It is a draw!");
			System.out.println();
		}
		if (computerChoice.equals("rock") && humanChoice.equals("paper")) {
			System.out.println();
			System.out.println("Computer chose rock.");
			System.out.println("You won!");
			System.out.println();
			humanWon++;
		}
		if (computerChoice.equals("rock") && humanChoice.equals("scissors")) {
			System.out.println();
			System.out.println("Computer chose rock.");
			System.out.println("You lost...");
			System.out.println();
			computerWon++;
		}
		if (computerChoice.equals("paper") && humanChoice.equals("rock")) {
			System.out.println();
			System.out.println("Computer chose paper.");
			System.out.println("You lost...");
			System.out.println();
			computerWon++;
		}
		if (computerChoice.equals("paper") && humanChoice.equals("paper")) {
			System.out.println();
			System.out.println("Computer chose paper.");
			System.out.println("It is a draw!");
			System.out.println();
		}
		if (computerChoice.equals("paper") && humanChoice.equals("scissors")) {
			System.out.println();
			System.out.println("Computer chose paper.");
			System.out.println("You won!");
			System.out.println();
			humanWon++;
		}
		if (computerChoice.equals("scissors") && humanChoice.equals("rock")) {
			System.out.println();
			System.out.println("Computer chose scissors.");
			System.out.println("You won!");
			System.out.println();
			humanWon++;
		}
		if (computerChoice.equals("scissors") && humanChoice.equals("paper")) {
			System.out.println();
			System.out.println("Computer chose scissors.");
			System.out.println("You lost...");
			System.out.println();
			computerWon++;
		}
		if (computerChoice.equals("scissors") && humanChoice.equals("scissors")) {
			System.out.println();
			System.out.println("Computer chose scissors.");
			System.out.println("It is a draw!");
			System.out.println();
		} 
		if (!(humanChoice.equals("rock") || humanChoice.equals("paper") || humanChoice.equals("scissors"))){
			System.out.println();
		    System.out.println("You typed \"" + humanChoice + "\" which is invalid, please pick between rock, paper and scissors");
		}
		results[0] = humanWon;
	    results[1] = computerWon;

	    return results;
	}
	
	public static int playAgain(Scanner console) {
		System.out.println();
		System.out.println("Type 1 if you want to play again.");
		System.out.print("Choice: ");
		int again = console.nextInt();
		System.out.println();
		System.out.println("----------------------------------");
		return again;
	}

	// Selects a random number and randomly picks a choice.
	public static String choiceGen() {
		Random rand = new Random();
		int randnum = rand.nextInt(3);
		if (randnum == 0) {
			return "scissors";
		}
		if (randnum == 1) {
			return "rock";
		} else {
			return "paper";
		}
	}

}
