package dev.danvega.tasks;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Task {

    @Id
    private String id;
    private String description;

    protected Task() {
    }

    public Task(String description) {
        this.id = UUID.randomUUID().toString();
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
