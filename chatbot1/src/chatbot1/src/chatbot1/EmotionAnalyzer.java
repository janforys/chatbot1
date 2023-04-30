package chatbot1.src.chatbot1;

import java.util.List;

class EmotionAnalyzer {
	
	int levelOfHappiness = 10; 
	
	public void analyzeInput(String userInput) throws Exception {
		
		List<String> words = List.of(userInput.split(" "));
		
		if (words.size() == 0) {
			throw new Exception("Empty input");
		}
		
		if (words.size() > 1) {
			levelOfHappiness++;
		}
	}
}