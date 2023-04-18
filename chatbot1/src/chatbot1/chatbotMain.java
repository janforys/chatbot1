package chatbot1;

import java.util.Scanner;

public class chatbotMain {

	public static void main(String[] args) {
		
		int levelOfHapinness = 10;
		String request = "How can I help you?";
		String defaultResponse = "That's great!";
		String happySign = "<3";
		
		while(true) {	
			
		System.out.println(request);
		Scanner in = new Scanner(System.in);
		String userInput = in.nextLine();
		
		if (userInput.length() > 3) {
			levelOfHapinness++;
		}
		
		String response = defaultResponse;
		
		if (levelOfHapinness > 11) {
			response = response + ' ' + happySign;
		}
		
		System.out.println(response);
		
		}
		
	}	
}
