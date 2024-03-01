package com.monikapustula.dogotogo.model;

public class DogDto {
    private String breed;
    private String fileName;

    public DogDto() {
    }

    public DogDto(String breed, String fileName) {
        this.breed = breed;
        this.fileName = fileName;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
