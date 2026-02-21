package model.learning;

import java.time.LocalDateTime;

import utils.validation.ValidateHealth;
import utils.validation.ValidateLearning;

public class Book {
    // Fields
    private String id = "UNASSIGNED";
    private String title = "UNASSIGNED";
    private String author = "UNASSIGNED";
    private int pages = 0;
    private int pagesRead = 0;
    private int rating = 0;
    private LocalDateTime start = null;
    private LocalDateTime finish = null;

    // Constructor
    public Book(
            String id,
            String title,
            String author,
            int pages,
            int pagesRead,
            LocalDateTime start,
            LocalDateTime finish
    ) {
        ValidateLearning.validateId(id);
        ValidateLearning.validateTitle(title);
        ValidateLearning.validateAuthor(author);
        ValidateLearning.validatePages(pages);
        ValidateLearning.validatePagesRead(pagesRead);
        ValidateLearning.validateStart(start);
        ValidateLearning.validateFinish(finish);

        this.id = id;
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.pagesRead = pagesRead;
        this.start = start;
        this.finish = finish;
    }


    // Getters
    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getPages() { return pages; }
    public int getPagesRead() { return pagesRead; }
    public LocalDateTime getStart() { return start; }
    public LocalDateTime getFinish() { return finish; }

    // Setters
    public void setId(String id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setPages(int pages) { this.pages = pages; }
    public void setPagesRead(int pagesRead) { this.pagesRead = pagesRead; }
    public void setStart(LocalDateTime start) { this.start = start; }
    public void setFinish(LocalDateTime finish) { this.finish = finish; }

    @Override
    public String toString() {
        return String.format(
                "ID: %s, Title: %s, Author: %s, Total Pages: %d, Pages Read: %d, Start: %s, Finish: %s",
                id, title, author, pages, pagesRead, start, finish
        );
    }
}
