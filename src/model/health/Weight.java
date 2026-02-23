package model.health;

import utils.validation.ValidateHealth;

public class Weight {
    // Fields
    private int id;
    private String name;
    private int age;
    private int height;
    private double weight;

    // Constructor
    public Weight(
        int id,
        String name,
        int age,
        int height,
        double weight
    ) {
        ValidateHealth.validateId(id);
        ValidateHealth.validateName(name);
        ValidateHealth.validateAge(age);
        ValidateHealth.validateHeight(height);
        ValidateHealth.validateWeight(weight);

        this.id = id;
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }


    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public int getHeight() { return height; }
    public double getWeight() { return weight; } 

    // Setters
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setHeight(int height) { this.height = height; }
    public void setWeight(double weight) { this.weight = weight; }


    @Override
    public String toString() {
        return String.format(
            "ID: %d, Name: %s, Age: %d, Height: %d, Weight: %.2f",
            id, name, age, height, weight
        );
    }
}
