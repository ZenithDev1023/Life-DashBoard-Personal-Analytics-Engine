import java.util.Scanner;

import java.time.LocalDateTime;

import service.Learning.LearningService;
import views.learning.BookView;
import views.learning.StudyView;


public class LearningModule {
    // Fields
    private LearningService learningService;
    private StudyView studyView;
    private BookView bookView;
    private Scanner scanner;
    private boolean running;

    private int studyId = 0;
    private int bookId = 0;


    public LearningModule(
        LearningService learningService,
        StudyView studyView,
        BookView bookView,
        Scanner scanner,
        boolean running
    ) {
        this.learningService = learningService;
        this.studyView = studyView;
        this.bookView = bookView;
        this.scanner = scanner;
        this.running = running;
    }


    // methods
    public void run() {
        while (running) {
            showMenu();
            int choice = getUserChoice();
            handleChoice(choice);
        }
    }


    public void showMenu() {
        System.out.println("\n" + "=".repeat(50));

    }

    public int getUserChoice() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public void handleChoice(int choice) {
        switch (choice) {
            case 1 -> addSession();
            case 2 -> addBook();
            case 3 -> trackSession();
            case 4 -> trackBook();
            case 5 -> analyze();
            case 6 -> {
                System.out.println("Returning to Main Menu...");
                running = false;
            }
            default -> {
                System.out.println("Invalid option. Please try again.");
            }

        }
    }

    public void addSession() {
        System.out.println("\n--- Add Study Session ---");

        System.out.print("Subject: ");
        String subject = scanner.nextLine();

        System.out.print("Topic: ");
        String topic = scanner.nextLine();

        System.out.print("Duration: ");
        int duration = Integer.parseInt(scanner.nextLine());

        System.out.print("Comprehension: ");
        int comprehension = Integer.parseInt(scanner.nextLine());

        LocalDateTime time = LocalDateTime.now();

        learningService.addSession(studyId++, subject, topic, duration, comprehension, time);
        System.out.println("Study Session added successfully!");
    }


    public void addBook() {
        System.out.print("Title: ");
        String title = scanner.nextLine();

        System.out.print("Author: ");
        String author = scanner.nextLine();

        System.out.print("Pages: ");
        int pages = Integer.parseInt(scanner.nextLine());

        System.out.print("Pages Read: ");
        int pagesRead = Integer.parseInt(scanner.nextLine());

        System.out.print("Start: ");
        LocalDateTime start = LocalDateTime.parse(scanner.nextLine());

        System.out.print("Finish: ");
        LocalDateTime finish = LocalDateTime.parse(scanner.nextLine());

        learningService.addBook(bookId++, title, author, pages, pagesRead, start, finish);
        System.out.println("Book added successfully!");
    }


    public void trackSession() {
        System.out.println("\n--- Track Study Session ---");

        System.out.print("Enter ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println(studyView.display(id));
    }


    public void trackBook() {
        System.out.println("\n--- Track Book ---");

        System.out.print("Enter ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        
        System.out.println(bookView.display(id));
    }


    public void analyze() {
        System.out.println(studyView.display(studyId));
        System.out.println(bookView.display((bookId)));
    }



    // Getters
    public LearningService getLearningService() { return learningService; }
    public StudyView getStudyView() { return studyView; }
    public BookView getBookView() { return bookView; }
}
