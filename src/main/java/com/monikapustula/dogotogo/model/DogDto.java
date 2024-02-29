package com.monikapustula.dogotogo.model;

public class DogDto {
    private String breed;

    public DogDto(String breed){
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
