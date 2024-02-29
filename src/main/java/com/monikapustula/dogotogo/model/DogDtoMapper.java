package com.monikapustula.dogotogo.model;

import org.springframework.stereotype.Service;

@Service
public class DogDtoMapper {
    public static DogDto map(Dog dog) {
        return new DogDto(
                dog.getBreed()
        );
    }
}
