package service.Relationship;

import java.util.List;

import enums.InteractionType;
import model.relationship.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class RelationShipService {
    // Fields
    private List<Contact> contacts = new ArrayList<>();
    private List<Interactions> interactions = new ArrayList<>();

    // Constructor
    public RelationShipService(
        List<Contact> contacts,
        List<Interactions> interactions
    ) {
        this.contacts = contacts;
        this.interactions = interactions;
    }


    // methods
    public Contact addContact(int id, String name, String email, String phone, LocalDate birthday, String category) {
        Contact contact = new Contact(id, name, email, phone, birthday, category);

        contacts.add(contact);
        System.out.println("Successfully added contact!");

        return contact;
    }


    public Interactions logInteraction(int id, String interaction, InteractionType type, LocalDateTime time, String notes) {
        Interactions i = new Interactions(id, interaction, type, time, notes);

        interactions.add(i);
        System.out.println("Interaction added successfully!");

        return i;
    }


    public int getContactsByFrequency() {

    }


    public int calculateStrength() {

    }


    public String suggestFollowUps() {
        
    }


    // Getters
    public List<Contact> getContacts() { return contacts; }
    public List<Interactions> getInteractions() { return interactions; }
}
