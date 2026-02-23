package model.relationship;

import java.time.LocalDateTime;

import enums.InteractionType;

import utils.validation.ValidateRelationship;

public class Interactions {
    // Fields
    private int id = 0;
    private String interaction = "UNASSIGNED";
    private InteractionType type = null;
    private LocalDateTime time = null;
    private String notes = "UNASSIGNED";

    // Constructor
    public Interactions(
            int id,
            String interaction,
            InteractionType type,
            LocalDateTime time,
            String notes
    ) {
        ValidateRelationship.validateId(id);
        ValidateRelationship.validateInteraction(interaction);
        ValidateRelationship.validateType(type);
        ValidateRelationship.validateTime(time);
        ValidateRelationship.validateNotes(notes);

        this.id = id;
        this.interaction = interaction;
        this.type = type;
        this.time = time;
        this.notes = notes;
    }


    // Getters
    public int getId() { return id; }
    public String getInteraction() { return interaction; }
    public InteractionType getType() { return type; }
    public LocalDateTime getTime() { return time; }
    public String getNotes() { return notes; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setInteraction(String interaction) { this.interaction = interaction; }
    public void setType(InteractionType type) { this.type = type; }
    public void setTime(LocalDateTime time) { this.time = time; }
    public void setNotes(String notes) { this.notes = notes; }

    @Override
    public String toString() {
        return String.format(
                "ID: %d, Interaction: %s, Type: %s, Time: %s, Notes: %s",
                id, interaction, type, time, notes
        );
    }
}
