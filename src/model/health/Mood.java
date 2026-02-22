package model.health;

import enums.MoodType;
import java.time.LocalDateTime;

import utils.validation.ValidateHealth;

public class Mood {
    // Fields
    private int id = 0;
    private MoodType type = null;
    private int energy = 0;
    private int stress = 0;
    private LocalDateTime time = null;

    // Constructor
    public Mood(
            int id,
            MoodType type,
            int energy,
            int stress,
            LocalDateTime time
    ) {
        ValidateHealth.validateId(id);
        ValidateHealth.validateMoodType(type);
        ValidateHealth.validateEnergy(energy);
        ValidateHealth.validateStress(stress);
        ValidateHealth.validateTime(time);

        this.id = id;
        this.type = type;
        this.energy = energy;
        this.stress = stress;
        this.time = time;
    }

    // Getters
    public int getId() { return id; }
    public MoodType getType() { return type; }
    public int getEnergy() { return energy; }
    public int getStress() { return stress; }
    public LocalDateTime getTime() { return time;}

    // Setters
    public void setId(int id) { this.id = id; }
    public void setType(MoodType type) { this.type = type; }
    public void setEnergy(int energy) { this.energy = energy; }
    public void setStress(int stress) { this.stress = stress; }
    public void setTime(LocalDateTime time) { this.time = time; }

    @Override
    public String toString() {
        return String.format(
                "ID: %d, Type: %s, Energy: %d, Stress: %d, Time: %s",
                id, type, energy, stress, time
        );
    }
}
