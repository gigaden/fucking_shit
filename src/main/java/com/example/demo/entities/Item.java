package com.example.demo.entities;
import javax.persistence.*;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Component;

@Entity
@Table(name="items")
public class Item {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "title")
    private String title;

    public Item(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Item() {
    }
}
