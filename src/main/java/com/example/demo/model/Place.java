package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
public class Place {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String address;
    @OneToMany
    private List<Day> days;
}
