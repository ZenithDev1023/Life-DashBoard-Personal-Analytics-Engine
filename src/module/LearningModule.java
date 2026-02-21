import java.util.Scanner;

import service.Learning.LearningService;
import views.*;
import views.learning.BookView;
import views.learning.StudyView;


public class LearningModule {
    // Fields
    private LearningService learningService;
    private StudyView studyView;
    private BookView bookView;

    Scanner scanner = new Scanner(System.in);

    public LearningModule(
        LearningService learningService,
        StudyView studyView,
        BookView bookView
    ) {
        this.learningService = learningService;
        this.studyView = studyView;
        this.bookView = bookView;
    }


    // methods
    public void run() {

    }


    public void showMenu() {

    }


    public void addSession() {

    }


    public void trackBook() {

    }


    public void analyze() {
        
    }



    // Getters
    public LearningService getLearningService() { return learningService; }
    public StudyView getStudyView() { return studyView; }
    public BookView getBookView() { return bookView; }
}
