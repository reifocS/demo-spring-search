package org.example.lacentrale.repositories;

import org.example.lacentrale.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface CarRepository extends JpaRepository<Car, Long>, JpaSpecificationExecutor<Car> {
}