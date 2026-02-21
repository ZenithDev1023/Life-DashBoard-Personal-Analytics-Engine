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

    Scanner scanner = new Scanner(System.in);

    public RelationshipModule(
        RelationShipService relationShipService,
        ContactView contactView,
        InteractionView interactionView
    ) {
        this.relationshipService = relationShipService;
        this.contactView = contactView;
        this.interactionView = interactionView;
    }


    public void run() {

    }


    public void showMenu() {

    }


    public void addContact() {

    }


    public void logInteraction() {

    }


    public void analyze() {

    }


    // Getters
    public RelationShipService getRelationShipService() { return relationshipService; }
    public ContactView getContactView() { return contactView; }
    public InteractionView getInteractionView() { return interactionView; }
}
