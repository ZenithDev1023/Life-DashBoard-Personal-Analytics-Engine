package service.Learning;

import java.time.LocalDateTime;

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
    public StudySession addSession(int studyId, String subject, String topic, int duration, int comprehension, LocalDateTime time) {
        StudySession studySession = new StudySession(studyId, subject, topic, duration, comprehension, time);
        return studySession;
    }

    public Book addBook(int id, String title, String author, int pages, int pagesRead, LocalDateTime start, LocalDateTime finish) {
        Book book = new Book(id, title, author, pages, pagesRead, start, finish);
        return book;
    }

    public StringBuilder viewSession(int id) {
        StringBuilder sb = new StringBuilder();

        for (StudySession session : studySession) {
            if (session.getId() == id) {
                sb.append(id).append(", ")
                .append(session.getSubject()).append(", ")
                .append(session.getTopic()).append(", ")
                .append(session.getDuration()).append(", ")
                .append(session.getComprehension()).append(", ")
                .append(session.getTime()).append("\n");
            }
        }
        return sb;
    }

    public StringBuilder viewBook(int id) {
        StringBuilder sb = new StringBuilder();
        
        for (Book b : book) {
            if (b.getId() == id) {
                sb.append(id).append(", ")
                .append(b.getTitle()).append(", ")
                .append(b.getAuthor()).append(", ")
                .append(b.getPages()).append(", ")
                .append(b.getPagesRead()).append(", ")
                .append(b.getStart()).append(", ")
                .append(b.getFinish()).append("\n");
            }
        }
        return sb;
    }


    public LocalDateTime getStudyHours(int studyId) {
        for (StudySession session : studySession) {
            if (session.getId() == studyId) {
                return session.getTime();
            }
        }

        System.out.println("Study session not found...");
        return null;
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
