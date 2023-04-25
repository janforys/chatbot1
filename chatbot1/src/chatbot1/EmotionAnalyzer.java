package chatbot1;

class EmotionAnalyzer {
	
	int levelOfHappiness = 10;
	
	public void analyzeInput(String userInput) {
		if (userInput.length() > 3) {
			levelOfHappiness++;
		}	
	}
}