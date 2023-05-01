package chatbot1.src.chatbot1;

import java.util.List;
import java.util.Set;

class EmotionAnalyzer {

    int levelOfHappiness = 10;
    Set<String> specialWords = Set.of("great", "super", "fantastic", "awesome", "funny");

    void analyzeInput(String userInput) throws Exception {
    	
        List<String> words = List.of(userInput.split(" "));

        if (words.isEmpty()) {
            throw new Exception("There is no words");
        }
        
        for (String word : words) {
        	if (specialWords.contains(word)) {
        		levelOfHappiness++;
        	}
        }
    }
    
}