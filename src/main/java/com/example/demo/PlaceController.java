package com.example.demo;

import com.example.demo.model.Place;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlaceController {

    @Autowired
    private PlaceRepository placeRepository;

    @GetMapping
    public ResponseEntity<Place> getPlace(@RequestParam int id) {
        var res = placeRepository.getPlace(id);
        if (res != null) {
            return ResponseEntity.ok(res);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
