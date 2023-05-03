package chatbot1.src.chatbot1;

import java.util.Map;

class Rules {
	
	private int happinessThreshold;
	private int angerThreshold;
	private String appendSign;
	
	Rules(int happinessThreshold, int angerThreshold, String appendSign) {
		this.happinessThreshold = happinessThreshold;
		this.angerThreshold = angerThreshold;
		this.appendSign = appendSign;
	}
	
	boolean isSatisfied(Map<Emotion, Integer> emotionsLevels) {
		return emotionsLevels.get(Emotion.HAPPINESS) > happinessThreshold &&
				emotionsLevels.get(Emotion.ANGER) > angerThreshold;
	}
	
	String applyEnding() {
		return appendSign;
	}
	
}
