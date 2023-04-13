package chatbot1;

import java.util.Scanner;

public class chatbotMain {

	public static void main(String[] args) {
		
		int levelOfHapinness = 10;
		
		String request = "How can I help you?";
		System.out.println(request);
		
		Scanner in = new Scanner(System.in);
		String userInput = in.nextLine();
		
		//System.out.println(userInput);
		
		System.out.println("Did you said " + userInput + "?");
		userInput = in.nextLine();
		System.out.println("That's great");
		
	}	
}
