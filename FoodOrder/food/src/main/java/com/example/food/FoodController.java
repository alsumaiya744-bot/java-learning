package com.example.food;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodService service;

  
    @PostMapping("/add")
    public String addFood(@RequestBody FoodItem food) throws Exception {

        return service.addFood(food);
    }

  
    @PutMapping("/update/{id}")
public String updateFood(@PathVariable int id,
                         @RequestBody FoodItem food)
                         throws Exception {

    return service.updateFood(id, food);
}

  
    @GetMapping("/{id}")
    public FoodItem getById(@PathVariable int id) throws Exception {

        return service.getById(id);
    }

  
    @GetMapping("/all")
    public List<FoodItem> getAllFoods() throws Exception {

        return service.getAllFoods();
    }

    
    @DeleteMapping("/delete/{id}")
    public String deleteFood(@PathVariable int id) throws Exception {

        return service.deleteFood(id);
    }
}