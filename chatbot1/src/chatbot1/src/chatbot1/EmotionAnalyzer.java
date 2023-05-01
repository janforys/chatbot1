package chatbot1.src.chatbot1;

import java.util.List;
import java.util.Set;

class EmotionAnalyzer {

    int levelOfHappiness = 10;
    int levelOfSadness = 10;
    int levelOfAnger = 10;
    Set<String> specialHappinessWords = Set.of("great", "super", "fantastic", "awesome", "funny");

    int getEmotionLevel(Emotion emotion) {
    	switch (emotion) {
	    	case HAPPINESS -> {
	    		return levelOfHappiness;
	    	}
	    	case SADNESS -> {
	    		return levelOfSadness;
	    	}
	    	case ANGER -> {
	    		return levelOfAnger;
	    	}
    	}
		return 0;
    }
    
    void analyzeInput(String userInput) throws Exception {
    	
        List<String> words = List.of(userInput.split(" "));

        if (words.isEmpty()) {
            throw new Exception("There is no words");
        }
        
        for (String word : words) {
        	if (specialHappinessWords.contains(word.toLowerCase())) {
        		levelOfHappiness++;
        	}
        }
    }
    
}