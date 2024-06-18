package org.example.lacentrale.controllers;

import org.example.lacentrale.entities.Car;
import org.example.lacentrale.repositories.CarRepository;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import com.sipios.springsearch.anotation.SearchSpec;
@RestController
class CarController {

    private final CarRepository repository;

    CarController(CarRepository repository) {
        this.repository = repository;
    }
    @GetMapping("/cars/filter")
    List<Car> search(@SearchSpec Specification<Car> specs) {
        return repository.findAll(Specification.where(specs));
    }
}