package com.workintech.zoo.controller;

import com.workintech.zoo.entity.Kangaroo;
import com.workintech.zoo.validations.KangarooValidation;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/kangaroos")
public class KangarooController {
    Map<Integer, Kangaroo> kangaroos;

    @PostConstruct
    public void init(){
        kangaroos = new HashMap<>();
    }

    @GetMapping
    public List<Kangaroo> find(){
        return this.kangaroos.values().stream().toList();
    }

    @GetMapping("/{id}")
    public Kangaroo findId(@PathVariable("id") Integer id){
        KangarooValidation.isIdValid(id);
        KangarooValidation.checkKangarooExistence(kangaroos,id,true);
        return kangaroos.get(id);
    }

    @PostMapping
    public Kangaroo addList(@RequestBody Kangaroo kangaroo){
        KangarooValidation.checkKangarooExistence(kangaroos, kangaroo.getId(), false);
        KangarooValidation.checkKangarooWeight(kangaroo.getWeight());
        KangarooValidation.checkKangarooHeight(kangaroo.getHeight());
        kangaroos.put(kangaroo.getId(), kangaroo);
        return kangaroos.get(kangaroo.getId());
    }

    @PutMapping("/{id}")
    public Kangaroo update(@PathVariable("id") Integer id, @RequestBody Kangaroo kangaroo){
        KangarooValidation.isIdValid(id);
        KangarooValidation.checkKangarooHeight(kangaroo.getHeight());
        KangarooValidation.checkKangarooWeight(kangaroo.getWeight());
        kangaroo.setId(id);
        if(kangaroos.containsKey(id)){
         kangaroos.put(id, kangaroo);
            return kangaroos.get(id);
        } else{
            return addList(kangaroo);
        }
    }

    @DeleteMapping("/{id}")
    public Kangaroo delete(@PathVariable("id") Integer id){
        KangarooValidation.isIdValid(id);
        KangarooValidation.checkKangarooExistence(kangaroos,id,true );
        return kangaroos.remove(id);
    }



}
