package com.example.demo;

import com.example.demo.model.Day;
import com.example.demo.model.DayEnum;
import com.example.demo.model.OpeningHours;
import com.example.demo.model.Place;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class PlaceRepository {

    EntityManager em;

    public Place getPlace(int id) {
        switch (id) {
            case 1:
                return initData().get(0);
            case 2:
                return initData().get(1);
            default:
                return null;
        }
    }

    private List<Place> initData() {
        OpeningHours morning = new OpeningHours(1, 800, 1200, "open");
        OpeningHours afternoon = new OpeningHours(2, 1300, 1800, "open");
        OpeningHours closed = new OpeningHours(2, 0, 0, "closed");

        Day mon = new Day(1, DayEnum.MON, List.of(morning, afternoon));
        Day tue = new Day(2, DayEnum.TUE, List.of(morning, afternoon));
        Day wed = new Day(3, DayEnum.WED, List.of(morning, afternoon));
        Day thu = new Day(4, DayEnum.THU, List.of(morning, afternoon));
        Day fri = new Day(5, DayEnum.FRI, List.of(morning, afternoon));
        Day sat = new Day(6, DayEnum.SAT, List.of(closed));
        Day sun = new Day(7, DayEnum.SUN, List.of(closed));

        Place cafe = new Place(1, "Cafe du Monde", "Rue de Peter le Grand 12, 1234 Genf",
                List.of(mon, tue, wed, thu, fri, sat, sun));

        Place bakery = new Place(2, "Judis Backofen", "Bernstrasse 44, 9004 Zürich",
                List.of(mon, tue, wed, thu, fri, sat, sun));

        return List.of(cafe, bakery);
    }
}
