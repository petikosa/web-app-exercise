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
public class Day {
    @Id
    @GeneratedValue
    private int id;
    private DayEnum day;
    @OneToMany
    private List<OpeningHours> openingHours;
}
