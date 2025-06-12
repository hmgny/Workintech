package com.workintech.s17d2.rest;

import com.workintech.s17d2.model.Developer;
import com.workintech.s17d2.model.JuniorDeveloper;
import com.workintech.s17d2.model.MidDeveloper;
import com.workintech.s17d2.model.SeniorDeveloper;
import com.workintech.s17d2.tax.Taxable;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/developers")
public class DeveloperController {
    public Map<Integer, Developer> developers = new HashMap<>();
    private Taxable taxable;

    @Autowired
    public DeveloperController(Taxable taxable) {
        this.taxable = taxable;
    }

    @PostConstruct
    public void init(){
        this.developers = new HashMap<>();
        this.developers.put(1, new JuniorDeveloper(1,"Merve", 50000));
    }
    @GetMapping
    public List<Developer> getAllDevelopers(){
        return developers.values().stream().toList();
    }
    @GetMapping("/{id}")
    public Developer getById(@PathVariable("id") int id){
        Developer foundDeveloper = this.developers.get(id);
        return foundDeveloper;
    }
    @PutMapping("/{id}")
    public void updateDeveloper(@PathVariable int id, @RequestBody Developer developer){
        developers.put(id, developer);
    }
    @DeleteMapping("/{id}")
    public void deleteDeveloper(@PathVariable int id){
        developers.remove(id);
    }
    @PostMapping
    public ResponseEntity<Developer> addDeveloper(@RequestBody Developer developer){
        if(developer instanceof JuniorDeveloper){
            developer.setSalary(developer.getSalary() - developer.getSalary() * taxable.getSimpleTaxRate() / 100);
        } else if (developer instanceof MidDeveloper) {
            developer.setSalary(developer.getSalary() - developer.getSalary() * taxable.getMiddleTaxRate() / 100);
        } else if (developer instanceof SeniorDeveloper) {
            developer.setSalary(developer.getSalary() - developer.getSalary() * taxable.getUpperTaxRate() / 100);
        }
        developers.put(developer.getId(), developer);
        return ResponseEntity.status(HttpStatus.CREATED).body(developer);
    }

}
