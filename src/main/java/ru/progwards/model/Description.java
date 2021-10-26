package ru.progwards.model;

import javax.persistence.*;

@Entity
public class Description {
    private Long id;
    private String decs;

    @Basic
    public String getDecs() {
        return decs;
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

    public void setDecs(String decs) {
        this.decs = decs;
    }

}
