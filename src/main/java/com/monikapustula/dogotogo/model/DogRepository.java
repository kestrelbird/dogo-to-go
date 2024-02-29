package com.monikapustula.dogotogo.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DogRepository extends CrudRepository<Dog, Long> {
    public List<Dog> findAllBySizeAndActivityAndCoatCare(int size, int activity, int coatCare);
}
