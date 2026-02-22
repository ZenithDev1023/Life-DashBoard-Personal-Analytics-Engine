package model.learning;

import java.time.LocalDateTime;

import utils.validation.ValidateHealth;
import utils.validation.ValidateLearning;

public class StudySession {
    // Fields
    private int id;
    private String subject;
    private String topic;
    private int duration;
    private int comprehension;
    private LocalDateTime time;

    // Constructor
    public StudySession(
            int id,
            String subject,
            String topic,
            int duration,
            int comprehension,
            LocalDateTime time
    ) {
        ValidateLearning.validateId(id);
        ValidateLearning.validateSubject(subject);
        ValidateLearning.validateTopic(topic);
        ValidateLearning.validateDuration(duration);
        ValidateLearning.validateComprehension(comprehension);
        ValidateLearning.validateTime(time);

        this.id = id;
        this.subject = subject;
        this.topic = topic;
        this.duration = duration;
        this.comprehension = comprehension;
        this.time = time;
    }


    // Getters
    public int getId() { return id; }
    public String getSubject() { return subject; }
    public String getTopic() { return topic; }
    public int getDuration() { return duration; }
    public int getComprehension() { return comprehension; }
    public LocalDateTime getTime() { return time; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setSubject(String subject) { this.subject = subject; }
    public void setTopic(String topic) { this.topic = topic; }
    public void setDuration(int duration) { this.duration = duration; }
    public void setComprehension(int comprehension) { this.comprehension = comprehension; }
    public void setTime(LocalDateTime time) { this.time = time; }

    @Override
    public String toString() {
        return String.format(
                "ID: %d, Subject: %s, Topic: %s, Duration: %d, Comprehension: %d, Time: %s",
                id, subject, topic, duration, comprehension, time
        );
    }
    
}
