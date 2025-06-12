package com.workintech.zoo.controller;

import com.workintech.zoo.entity.Kangaroo;
import com.workintech.zoo.entity.Koala;
import com.workintech.zoo.validations.KoalaValidation;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/koalas")
public class KoalaController {
    Map<Integer, Koala> koalas;

    @PostConstruct
    public void init(){
        koalas = new HashMap<>();
    }

    @GetMapping
    public List<Koala> find(){
        return this.koalas.values().stream().toList();
    }

    @GetMapping("/{id}")
    public Koala findId(@PathVariable("id") Integer id){
        KoalaValidation.checkKoalaExistence(koalas, id, true);
        KoalaValidation.isIdValid(id);
        return koalas.get(id);
    }

    @PostMapping
    public Koala addList(@RequestBody Koala koala){
        KoalaValidation.checkKoalaExistence(koalas, koala.getId(), false);
        KoalaValidation.checkKoalaWeight(koala.getWeight());
        koalas.put(koala.getId(), koala);
        return koalas.get(koala.getId());
    }

    @PutMapping("/{id}")
    public Koala update(@PathVariable("id") Integer id, @RequestBody Koala koala){
        KoalaValidation.checkKoalaExistence(koalas, id, true);
        KoalaValidation.checkKoalaWeight(koala.getWeight());
        if(koalas.containsKey(id)){
            koalas.put(id,koala);
            return koalas.get(id);
        }else {
            return addList(koala);
        }
    }

    @DeleteMapping("/{id}")
    public Koala delete(@PathVariable("id") Integer id){
        KoalaValidation.isIdValid(id);
        KoalaValidation.checkKoalaExistence(koalas,id,true);
        return koalas.remove(id);
    }

}
