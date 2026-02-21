package model.health;

import java.time.LocalDate;

import utils.validation.ValidateHealth;

public class Sleep {
    // Fields
    private String id = "UNASSIGNED";
    private double hours = 0.0;
    private int quality = 0;
    private LocalDate date = null;
    private String notes = "UNASSIGNED";

    // Constructor
    public Sleep(
            String id,
            double hours,
            int quality,
            LocalDate date,
            String notes
    ) {
        ValidateHealth.validateId(id);
        ValidateHealth.validateHours(hours);
        ValidateHealth.validateQuality(quality);
        ValidateHealth.validateDate(date);
        ValidateHealth.validateNotes(notes);

        this.id = id;
        this.hours = hours;
        this.quality = quality;
        this.date = date;
        this.notes = notes;
    }


    // Getters
    public String getId() { return id; }
    public double getHours() { return hours; }
    public int getQuality() { return quality; }
    public LocalDate getDate() { return date; }
    public String getNotes() { return notes; }

    // Setters
    public void setId(String id) { this.id = id; }
    public void setHours(double hours) { this.hours = hours; }
    public void setQuality(int quality) { this.quality = quality; }
    public void setDate(LocalDate date) { this.date = date; }
    public void setNotes(String notes) { this.notes = notes; }

    @Override
    public String toString() {
        return String.format(
                "ID: %s, Hours: %.2f, Quality: %d, Date: %s, Notes: %s",
                id, hours, quality, date, notes
        );
    }
}
