package com.example.demo;

import com.example.demo.model.OpeningHours;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class PlaceRepository {

    EntityManager em;

    private void initData() {
        OpeningHours openingHours1 = new OpeningHours(1, 800, 1200, "open");
        OpeningHours openingHours2 = new OpeningHours(2, 1300, 1800, "open");
    }
}
