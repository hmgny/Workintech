package com.workintech.s18d2.controller;

import com.workintech.s18d2.dto.VegetableResponse;
import com.workintech.s18d2.entity.Vegetable;
import com.workintech.s18d2.services.VegetableService;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/vegetables")
public class VegetableController {

    private final VegetableService vegetableService;

    @GetMapping
    public List<Vegetable> get(){
        return vegetableService.getByPriceAsc();
    }

    @GetMapping("/desc")
    public List<Vegetable> getDesc(){
        return vegetableService.getByPriceDesc();
    }

    @GetMapping("/{id}")
    public VegetableResponse get(@Positive(message = "id 0 dan küçük olamaz!") @PathVariable("id") Long id){
        return new VegetableResponse("get by id succed!", vegetableService.getById(id));
    }

    @PostMapping("/name/{name}")
    public List<Vegetable> getByName(@Size(min = 3, max = 45, message = "name 3-45 karakter arasında olmalı!") @PathVariable String name){
        return vegetableService.searchByName(name);
    }

    @PostMapping
    public Vegetable save(@Validated @RequestBody Vegetable vegetable){
        return vegetableService.save(vegetable);
    }

    @DeleteMapping("/{id}")
    public Vegetable delete(@NotNull @Positive @PathVariable Long id){
        return vegetableService.delete(id);
    }
}
