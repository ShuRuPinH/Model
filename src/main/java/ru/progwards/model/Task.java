package ru.progwards.model;

import javax.persistence.*;

@Entity
public class Task {

    private Long id;
    private String text;

    @Column (name = "text")
    public String getText() {
        return text;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }
}
