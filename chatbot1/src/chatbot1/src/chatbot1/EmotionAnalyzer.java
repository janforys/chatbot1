package chatbot1.src.chatbot1;

import java.util.List;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

class EmotionAnalyzer {

    int levelOfHappiness = 10;
    int levelOfSadness = 10;
    int levelOfAnger = 10;
    
    Set<String> specialHappinessWords = Set.of("great", "super", "fantastic", "awesome", "funny");
    Set<String> specialAngerWords = Set.of("stupid", "whatever", "worst", "poor", "dumb");
    
    Map<Emotion, Integer> getEmotionsLevels() {
    	Map<Emotion, Integer> emotionsLevels = new HashMap<>();
    	emotionsLevels.put(Emotion.HAPPINESS, levelOfHappiness);
    	emotionsLevels.put(Emotion.SADNESS, levelOfSadness);
    	emotionsLevels.put(Emotion.ANGER, levelOfAnger);
    	return emotionsLevels;
    }
    
    void analyzeInput(String userInput) throws Exception {
    	
        List<String> words = List.of(userInput.split(" "));

        if (words.isEmpty()) {
            throw new Exception("There is no words");
        }
        
        for (String word : words) {
        	if (specialHappinessWords.contains(word.toLowerCase())) {
        		levelOfHappiness++;
        	} else if 
        		(specialAngerWords.contains(word.toLowerCase())) {
        		levelOfAnger++;
        		}
        	}
        }
    
}