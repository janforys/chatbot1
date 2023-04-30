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
		Scanner in = new Scanner(System.in);
		String request = "How can I help you?";
		System.out.println(request);
		
		while (true) {		
			String userInput = in.nextLine();
			String response;
			
			try {
				emotionAnalyzer.analyzeInput(userInput);
				response = chatbotMain.getResponse(emotionAnalyzer.levelOfHappiness);
			} catch (Exception e) {
				response = "What did you said ?";
			}
			System.out.println(response);
		}	
	}	
}