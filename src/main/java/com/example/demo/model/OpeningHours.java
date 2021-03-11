package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
public class OpeningHours {
    @Id
    @GeneratedValue
    private int id;
    private int start;
    private int end;
    private String note;
}
