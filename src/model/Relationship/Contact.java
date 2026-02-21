package model.Relationship;

import java.time.LocalDate;

import utils.validation.ValidateRelationship;

public class Contact {
    // Fields
    private String id = "UNASSIGNED";
    private String name = "UNASSIGNED";
    private String email = "UNASSIGNED";
    private String phone = "UNASSIGNED";
    private LocalDate birthday = null;
    private String category = "UNASSIGNED";

    // Constructor
    public Contact(
            String id,
            String name,
            String email,
            String phone,
            LocalDate birthday,
            String category
    ) {
        ValidateRelationship.validateId(id);
        ValidateRelationship.validateName(name);
        ValidateRelationship.validateEmail(email);
        ValidateRelationship.validatePhone(phone);
        ValidateRelationship.validateBirthday(birthday);
        ValidateRelationship.validateCategory(category);

        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.birthday = birthday;
        this.category = category;
    }


    // Getters
    public String getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public LocalDate getBirthday() { return birthday; }
    public String getCategory() { return category; }

    // Setters
    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setBirthday(LocalDate birthday) { this.birthday = birthday; }
    public void setCategory(String category) { this.category = category; }

    @Override
    public String toString() {
        return String.format(
                "ID: %s, Name: %s, Email: %s, Phone: %s, Birthday: %s, Category: %s",
                id, name, email, phone, birthday, category
        );
    }
}
