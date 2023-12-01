import java.util.Scanner;
import java.util.Random;
//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
public class FirstGen {
	public static final String password = "password";
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int again;
		do {
			System.out.print("Please type the password to play. ");
			String humanPassword = console.next();
			console.nextLine();
			if (!(humanPassword.equals(password))) {
				System.out.println("The password in incorrect.");
			} else {
				
				intro(console);
					
					String humanChoice = console.next();
					console.nextLine();
					String computerChoice = choiceGen();
		
					humanChoice = humanChoice.toLowerCase();
					computerChoice = computerChoice.toLowerCase();
		
					if (humanChoice.equals("rock") || humanChoice.equals("paper") || humanChoice.equals("scissors")) {
						System.out.println("You picked " + humanChoice + " and the computer picked " + computerChoice + ".");
						winDrawLoss(computerChoice, humanChoice);
					} else {
						System.out.println("You picked " + humanChoice + " and the computer picked " + computerChoice + ".");
						winDrawLoss(computerChoice, humanChoice);
					}
			}
			System.out.print("Type 1 if you want to play again.");
			again = console.nextInt();
		} while (again == 1); 
		
		
		
	}

	// Welcomes the player by asking the name and tells the rules of the game.
	public static void intro(Scanner console) {
		System.out.print("Welcome! Please state your name in order to play. ");
		String humanName = console.nextLine();
		System.out.print("Hello " + humanName + ", "
				+ "please pick between rock, paper, and scissors. (Only the first word counts) ");
	}

	// Calculate the possibility and tells you your results.
	public static void winDrawLoss(String computerChoice, String humanChoice) {
		if (computerChoice.equals("rock") && humanChoice.equals("rock")) {
			System.out.println("It is a draw!");
		}
		if (computerChoice.equals("rock") && humanChoice.equals("paper")) {
			System.out.println("You won!");
		}
		if (computerChoice.equals("rock") && humanChoice.equals("scissors")) {
			System.out.println("You lost...");
		}
		if (computerChoice.equals("paper") && humanChoice.equals("rock")) {
			System.out.println("You lost...");
		}
		if (computerChoice.equals("paper") && humanChoice.equals("paper")) {
			System.out.println("It is a draw!");
		}
		if (computerChoice.equals("paper") && humanChoice.equals("scissors")) {
			System.out.println("You won!");
		}
		if (computerChoice.equals("scissors") && humanChoice.equals("rock")) {
			System.out.println("You won!");
		}
		if (computerChoice.equals("scissors") && humanChoice.equals("paper")) {
			System.out.println("You lost...");
		}
		if (computerChoice.equals("scissors") && humanChoice.equals("scissors")) {
			System.out.println("It is a draw!");
		}
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
