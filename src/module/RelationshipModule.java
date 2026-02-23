import java.util.Scanner;

import java.time.LocalDate;
import java.time.LocalDateTime;

import views.*;
import views.relationship.ContactView;
import views.relationship.InteractionView;
import service.Relationship.RelationShipService;

import enums.InteractionType;

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
        System.out.print("ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Phone: ");
        String phone = scanner.nextLine();

        System.out.print("Birthday: ");
        LocalDate brithday = LocalDate.parse(scanner.nextLine());

        System.out.print("Category: ");
        String category = scanner.nextLine();

        relationshipService.addContact(id, name, email, phone, brithday, category);
        System.out.println("Contact added successfully!");
    }


    public void logInteraction() {
        System.out.print("ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Interaction");
        String interaction = scanner.nextLine();

        System.out.print("Interaction Type (CALL/TEXT/EMAIL/MEETING/SOCIAL/GIFT): ");
        InteractionType type = InteractionType.valueOf(scanner.nextLine().toUpperCase());

        System.out.print("Time: ");
        LocalDateTime time = LocalDateTime.parse(scanner.nextLine());

        System.out.print("Notes: ");
        String notes = scanner.nextLine();

        relationshipService.logInteraction(id, interaction, type, time, notes);
        System.out.println("Interaction logged successfully!");
    }


    public void viewContact() {
        System.out.print("ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println(contactView.display(id));
    }

    public void viewInteraction() {
        System.out.print("ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println(interactionView.display(id));
    }

    public void analyze() {

    }


    // Getters
    public RelationShipService getRelationShipService() { return relationshipService; }
    public ContactView getContactView() { return contactView; }
    public InteractionView getInteractionView() { return interactionView; }
}
