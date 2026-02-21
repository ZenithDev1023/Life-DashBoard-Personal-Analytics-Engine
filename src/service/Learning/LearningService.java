package service.Learning;

import java.util.List;

import model.learning.*;

import java.util.ArrayList;

public class LearningService {
    // Fields
    List<StudySession> studySession = new ArrayList<>();
    List<Book> book = new ArrayList<>();
    List<Skill> skill = new ArrayList<>();

    // Constructor
    public LearningService(
        List<StudySession> studySession,
        List<Book> book,
        List<Skill> skill
    ) {
        this.studySession = studySession;
        this.book = book;
        this.skill = skill;
    }


    // methods
    public void addSession() {

    }


    public int getStudyHours() {

    }


    public int calculateComprehension() {

    }


    public String identifyWeakSpots() {

    }


    public String recommendNextTopic() {

    }


    // Getters
    public List<StudySession> getStudySession() { return studySession; }
    public List<Book> getBook() { return book; }
    public List<Skill> getSkill() { return skill; }
}
