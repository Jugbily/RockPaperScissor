import java.util.Scanner;

public class FirstGen {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		intro(console);

		String humanChoice = console.next();
		String computerChoice = computerChoiceGenerator();

		humanChoice = humanChoice.toLowerCase();
		computerChoice = computerChoice.toLowerCase();

		if (!(humanChoice.equals("rock")) || (humanChoice.equals("paper")) || (humanChoice.equals("scissor"))) {
			System.out.print("Restart the program, \"" + humanChoice + "\" is not a valid charater.");
		} else {
			System.out.println("You picked " + humanChoice + " and the computer picked " + computerChoice + ".");
			winDrawLoss(computerChoice, humanChoice);
		}
	}

	// Welcomes the player by asking the name and tells the rules of the game.
	public static void intro(Scanner console) {
		System.out.print("Welcome! Please state your name in order to play. ");
		String humanName = console.nextLine();
		System.out.print("Hello " + humanName + ", "
				+ "please pick between rock, paper, and scissor. (Only the first word counts) ");
	}
	
	// Calculate the possibility and tells you your results.
	public static void winDrawLoss(String computerChoice, String humanChoice) {
		if (computerChoice.equals("rock") && humanChoice.equals("rock")) {
			System.out.print("It is a draw!");
		}
		if (computerChoice.equals("rock") && humanChoice.equals("paper")) {
			System.out.print("You won!");
		}
		if (computerChoice.equals("rock") && humanChoice.equals("scissor")) {
			System.out.print("You lost...");
		}
		if (computerChoice.equals("paper") && humanChoice.equals("rock")) {
			System.out.print("You lost...");
		}
		if (computerChoice.equals("paper") && humanChoice.equals("paper")) {
			System.out.print("It is a draw!");
		}
		if (computerChoice.equals("paper") && humanChoice.equals("scissor")) {
			System.out.print("You won!");
		}
		if (computerChoice.equals("scissor") && humanChoice.equals("rock")) {
			System.out.print("You won!");
		}
		if (computerChoice.equals("scissor") && humanChoice.equals("paper")) {
			System.out.print("You lost...");
		}
		if (computerChoice.equals("scissor") && humanChoice.equals("scissor")) {
			System.out.print("It is a draw!");
		}
	}
	// Selects a random number and randomly picks a choice.
	public static String computerChoiceGenerator() {
		double randomNum = Math.random();
		String computerChoice = "";
		if (randomNum < (double) 1 / 3) {
			computerChoice = "Rock";
		} else if (randomNum < (double) 2 / 3) {
			computerChoice = "Paper";
		} else {
			computerChoice = "Scissor";
		}
		return computerChoice;
	}

}
