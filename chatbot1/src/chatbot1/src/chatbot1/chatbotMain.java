package chatbot1.src.chatbot1;

import java.util.Scanner;
import java.util.Map;
import java.util.*;

public class chatbotMain {

    private static String getResponse(Map<Emotion, Integer>emotions ,int iteration) {
    	
    	List<Rules> rules = new ArrayList<>();
        String[] responses = {"That's great", "You are awesome!", "Nice to hear it"};
        
        String defaultResponse = responses[iteration % responses.length];
        String happySign = "<3";
        String angrySign = ",,|,,";
        String response = defaultResponse;
        int levelOfHappiness = emotions.get(Emotion.HAPPINESS);
        int levelOfAnger = emotions.get(Emotion.ANGER);

        if (levelOfHappiness > 11) {
            response += " " + happySign;
        }
        
        if (levelOfAnger > 11) {
            response += " " + angrySign;
        }
        
        for (Rules rule : rules) {
        	if (rule.isSatisfied()) {
        		response += rule.applyEnding();
        		break;
        	}
        }
        
        return response;
    }

    public static void main(String[] args) {
    	
        EmotionAnalyzer emotionAnalyzer = new EmotionAnalyzer();
        Scanner in = new Scanner(System.in);
        int iteration = 0;
        String request = "How can I help you?";
        System.out.println(request);

        while (true) {
            String userInput = in.nextLine();
            String response;

            try {
                emotionAnalyzer.analyzeInput(userInput);
                response = getResponse(emotionAnalyzer.getEmotionsLevels(), iteration);
            } catch (Exception e) {
                response = "What did you said?";
            }

            System.out.println(response);
            iteration++;
        }
    }
    
}