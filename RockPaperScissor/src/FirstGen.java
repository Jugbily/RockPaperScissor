import java.util.Scanner;
public class FirstGen {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		intro(console);
		
		String humanChoice = console.next();
		String computerChoice = computerChoiceGenerator();
		System.out.println("The computer picked " + computerChoice + ".");
		
		winDrawLoss(computerChoice, humanChoice);
	}
	
	public static void intro(Scanner console) {
		System.out.print("Welcome! Please state your name in order to play. ");
		String humanName = console.nextLine();
		System.out.print("Hello, " + humanName + " please pick between Rock, Paper, and Scissor. ");
	}
	
	public static void winDrawLoss(String computerChoice, String humanChoice) {
		if(computerChoice.equals("Rock") && humanChoice.equals("Rock")) {
			System.out.print("It is a draw!");
		}
		if(computerChoice.equals("Rock") && humanChoice.equals("Paper")) {
			System.out.print("You won!");
		}
		if(computerChoice.equals("Rock") && humanChoice.equals("Scissor")) {
			System.out.print("You lost...");
		}
		if(computerChoice.equals("Paper") && humanChoice.equals("Rock")) {
			System.out.print("You lost...");
		}
		if(computerChoice.equals("Paper") && humanChoice.equals("Paper")) {
			System.out.print("It is a draw!");
		}
		if(computerChoice.equals("Paper") && humanChoice.equals("Scissor")) {
			System.out.print("You won!");
		}
		if(computerChoice.equals("Scissor") && humanChoice.equals("Rock")) {
			System.out.print("You won!");
		}
		if(computerChoice.equals("Scissor") && humanChoice.equals("Paper")) {
			System.out.print("You lost...");
		}
		if(computerChoice.equals("Scissor") && humanChoice.equals("Scissor")) {
			System.out.print("It is a draw!");
		}
	}
	
	public static String computerChoiceGenerator() {
		double randomNum = Math.random();
		String computerChoice = "";
		if(randomNum < (double) 1/3) {
			computerChoice = "Rock";
		} else if(randomNum < (double) 2/3) {
			computerChoice = "Paper";
		} else {
			computerChoice = "Scissor";
		}
		return computerChoice;
	}

}
