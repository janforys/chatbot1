package chatbot1.src.chatbot1;

import java.util.List;

class EmotionAnalyzer {

    int levelOfHappiness = 10;

    void analyzeInput(String userInput) throws Exception {
        List<String> words = List.of(userInput.split(" "));

        if (words.isEmpty()) {
            throw new Exception("There is no words");
        }

        if (words.size() > 1) {
            levelOfHappiness++;
        }
    }

}
