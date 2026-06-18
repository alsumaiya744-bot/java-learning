package com.example.food;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;



@RestController
@RequestMapping("/food")
public class FoodController
 {
    @Autowired
    private FoodService foodService;

    @PostMapping("/add")
    public FoodOrders addFood(@RequestBody FoodOrders food) {
        return foodService.addFood(food);
    }
    @GetMapping("/view")
    public List<FoodOrders> getAllFoods() { 
        return foodService.getAllFoods();
    }
    @GetMapping("/view/{id}")
    public FoodOrders getFoodById(@PathVariable int id) {
        return foodService.getFoodById(id);
    }
    @PutMapping("/update/{id}")
    public FoodOrders updateFood(@PathVariable int
         id, @RequestBody FoodOrders updatedFood) {
        return foodService.updateFood(id, updatedFood);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteFood(@PathVariable int id) {
        foodService.deleteFood(id);
    }


}
