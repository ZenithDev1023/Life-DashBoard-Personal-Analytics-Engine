import java.util.Scanner;

import views.*;
import views.relationship.ContactView;
import views.relationship.InteractionView;
import service.Relationship.RelationShipService;

public class RelationshipModule {
    // Fields
    private RelationShipService relationshipService;
    private ContactView contactView;
    private InteractionView interactionView;
    private Scanner scanner;
    private boolean running;


    public RelationshipModule(
        RelationShipService relationShipService,
        ContactView contactView,
        InteractionView interactionView,
        Scanner scanner,
        boolean running
    ) {
        this.relationshipService = relationShipService;
        this.contactView = contactView;
        this.interactionView = interactionView;
        this.scanner = scanner;
        this.running = running;
    }


    public void run() {
        while (running) {
            showMenu();
            int choice = getUserChoice();
            handleChoice(choice);
        }
    }


    public void showMenu() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("1. Add Contact");
        System.out.println("2. Log Interaction");
        System.out.println("3. View Contact");
        System.out.println("4. View Interaction");
        System.out.println("5. Analyze");
        System.out.println("6. Back to Main Menu");

        System.out.print("Enter choice: ");
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
            case 1 -> addContact();
            case 2 -> logInteraction();
            case 3 -> viewContact();
            case 4 -> viewInteraction();
            case 5 -> analyze();
            case 6 -> {
                System.out.println("Returning to Main Menu...");
                running = false;
            }
        }
    }


    public void addContact() {

    }

    public void logInteraction() {

    }

    public void viewContact() {

    }

    public void viewInteraction() {

    }

    public void analyze() {

    }


    // Getters
    public RelationShipService getRelationShipService() { return relationshipService; }
    public ContactView getContactView() { return contactView; }
    public InteractionView getInteractionView() { return interactionView; }
}
