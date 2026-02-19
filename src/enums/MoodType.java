package enums;

public enum MoodType {
    HAPPY("Happy"),
    SAD("Sad"),
    ANGRY("Angry"),
    TIRED("Tired"),
    STRESSED("Stressed"),
    ENERGETIC("Energetic"),
    CALM("Calm");

    private final String emotion;

    MoodType(String emotion) {
        this.emotion = emotion;
    }

    public String getEmotion() { return emotion; }

    @Override
    public String toString() {
        return "Emotion: " + emotion;
    }
}
