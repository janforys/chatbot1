package chatbot1;

import java.util.Scanner;

public class chatbotMain {
	
	private static String getResponse(int levelOfHappiness) {
		
		String defaultResponse = "That's great!";
		String happySign = "<3";
		String response = defaultResponse;
		
		if (levelOfHappiness > 11) {
			response += ' ' + happySign;
		}
		return response;
	}
	
	public static void main(String[] args) {
		
		EmotionAnalyzer emotionAnalyzer = new EmotionAnalyzer();
		String request = "How can I help you?";
		
		while (true) {	
			
		System.out.println(request);
		
		Scanner in = new Scanner(System.in);
		String userInput = in.nextLine();
		
		emotionAnalyzer.analyzeInput(userInput);
		
		String response = getResponse(emotionAnalyzer.levelOfHappiness);		
		System.out.println(response);		
		}	
	}	
}