package chatbot1.src.chatbot1;

import java.util.*;

public class chatbotMain {
	
	static boolean shouldExit;
	static List<Rules> rules = List.of(
			new Rules(11, 0, "<3"),
			new Rules(0, 11, ",,|,,")
	);
	
    private static String getResponse(Map<Emotion, Integer> emotionsLevels, String userInput, int iteration) {
    	      
    	String[] responses = {"That's great.", "You are awesome.", "Nice to hear it."};        
        String defaultResponse = responses[iteration % responses.length];
        String response = defaultResponse;
        
        if(userInput.equalsIgnoreCase("bYE")) {
        	shouldExit = true;
        	response = "BYE_XD";
        }
           
        for (Rules rule : rules) {
        	if (rule.isSatisfied(emotionsLevels)) {
        		response += rule.applyEnding();
        		break;
        	}
        }       
        return response;
    }

    public static void main(String[] args) {
    	   		
        EmotionAnalyzer emotionAnalyzer = new EmotionAnalyzer();
        Scanner in = new Scanner(System.in);
        String request = "How can I help you?";
        System.out.println(request);
        int iteration = 0;

        while (!shouldExit) {
            String userInput = in.nextLine();
            String response;

            try {
                emotionAnalyzer.analyzeInput(userInput);
                response = chatbotMain.getResponse(emotionAnalyzer.getEmotionsLevels(), userInput, iteration);
            } catch (Exception e) {
                response = "What did you said?";
            }

            System.out.println(response);
            iteration++;
        }
    }
    
}