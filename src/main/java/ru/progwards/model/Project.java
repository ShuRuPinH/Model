package ru.progwards.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Project {

    private Long id;
    private Description desc;
    private List <Task> tasks;



    @OneToOne
    @JoinColumn(name = "desc_id")
    public Description getDesc() {
        return desc;
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

    public void setDesc(Description desc) {
        this.desc = desc;
    }

    @OneToMany
    @JoinColumn(name = "tasks")
    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
