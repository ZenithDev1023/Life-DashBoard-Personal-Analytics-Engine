package service.Relationship;

import java.util.List;

import model.relationship.*;

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
    public void addContact() {

    }


    public void logInteraction() {

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
