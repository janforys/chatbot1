package chatbot1;

import java.util.Scanner;

public class chatbotMain {

	public static void main(String[] args) {
		
		int levelOfHapinness = 10;
		
		String request = "How can I help you?";
		System.out.println(request);
		
		Scanner in = new Scanner(System.in);
		String userInput = in.nextLine();
		
		if (userInput.length() > 3) {
			System.out.println("I am glad to talk with you.");
		} else {
			System.out.println("Did you said " + userInput + "?");
		}
		
		userInput = in.nextLine();
		
		System.out.printf(String.format("That's great, I am happy is %d and yours?%n", levelOfHapinness));
		System.out.println("?");
	}	
}
