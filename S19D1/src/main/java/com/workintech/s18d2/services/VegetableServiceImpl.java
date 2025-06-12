package com.workintech.s18d2.services;

import com.workintech.s18d2.entity.Vegetable;
import com.workintech.s18d2.exceptions.PlantException;
import com.workintech.s18d2.repository.VegetableRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class VegetableServiceImpl implements VegetableService {
    private VegetableRepository vegetableRepository;


    @Override
    public List<Vegetable> getByPriceAsc() {
        return vegetableRepository.getByPriceAsc();
    }

    @Override
    public Vegetable getById(Long id) {
        return vegetableRepository.findById(id).orElseThrow(()-> new PlantException("plant with given id is not exist: " + id, HttpStatus.NOT_FOUND));
    }

    @Override
    public List<Vegetable> getByPriceDesc() {
        return vegetableRepository.getByPriceDesc();
    }

    @Override
    public Vegetable save(Vegetable vegetable) {
        return vegetableRepository.save(vegetable);
    }

    @Override
    public List<Vegetable> searchByName(String name) {
        return vegetableRepository.getVegetableByName(name);
    }

    @Override
    public Vegetable delete(Long id) {
        Vegetable vegetable = vegetableRepository.getById(id);
        vegetableRepository.delete(vegetable);
        return vegetable;
    }
}
