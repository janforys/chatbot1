package chatbot1;

class EmotionAnalyzer {
	
	int levelOfHappiness = 10; 
	
	public void analyzeInput(String userInput) throws Exception {
		if (userInput.length() == 0) {
			throw new Exception("Empty input");
		}
		if (userInput.length() > 3) {
			levelOfHappiness++;
		}
	}
}