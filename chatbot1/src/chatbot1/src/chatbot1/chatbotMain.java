package chatbot1.src.chatbot1;

import java.util.Scanner;

public class chatbotMain {

    private static String getResponse(int levelOfHappiness, int iteration) {
        String[] responses = {"That's great", "You are awesome!",
                "Nice to hear it"};

        String defaultResponse = responses[iteration % responses.length];
        String happySign = ",,|,,";
        String response = defaultResponse;

        if (levelOfHappiness > 11) {
            response += ' ' + happySign;
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
                response = getResponse(emotionAnalyzer.levelOfHappiness, iteration);
            } catch (Exception e) {
                response = "What did you said?";
            }

            System.out.println(response);
            iteration++;
        }
    }
}