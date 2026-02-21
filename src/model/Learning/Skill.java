package model.Learning;

import utils.validation.ValidateLearning;

public class Skill {
    // Fields
    private String id = "UNASSIGNED";
    private String name = "UNASSIGNED";
    private int level = 0;
    private int hours = 0;

    // Constructor
    public Skill(
            String id,
            String name,
            int level,
            int hours
    ) {
        ValidateLearning.validateId(id);
        ValidateLearning.validateName(name);
        ValidateLearning.validateLevel(level);
        ValidateLearning.validateHours(hours);

        this.id = id;
        this.name = name;
        this.level = level;
        this.hours = hours;
    }


    // Getters
    public String getId()  { return id; }
    public String getName() { return name; }
    public int getLevel() { return level; }
    public int getHours() { return hours; }

    // Setters
    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setLevel(int level) { this.level = level; }
    public void setHours(int hours) { this.hours = hours; }

    @Override
    public String toString() {
        return String.format(
                "ID: %s, Name: %s, Level: %d, Hours: %d",
                id, name, level, hours
        );
    }
}
