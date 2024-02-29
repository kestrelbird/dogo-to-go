package com.monikapustula.dogotogo.model;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogService {
    private final DogRepository dogRepository;
    private final DogDtoMapper dogDtoMapper;

    public DogService(DogRepository dogRepository, DogDtoMapper dogDtoMapper) {
        this.dogRepository = dogRepository;
        this.dogDtoMapper = dogDtoMapper;
    }

    public List<DogDto> getDogs(int size, int activity, int coatCare) {
        return dogRepository.findAllBySizeAndActivityAndCoatCare(size, activity, coatCare)
                .stream()
                .map(DogDtoMapper::map)
                .toList();
    }
}
