package com.example.food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class FoodService
 {

    @Autowired
    private  FoodRepository foodRepository;

    public FoodOrders addFood(FoodOrders foods) {
        return foodRepository.save(foods);
    }

    public List<FoodOrders> getAllFoods() {
        return foodRepository.findAll();
    }

    public FoodOrders getFoodById(int id) {
        return foodRepository.findById(id).orElse(null);
    }

    public FoodOrders updateFood(int id, FoodOrders updatedFood) {
        FoodOrders existingFood = foodRepository.findById(id).orElse(null);
        if (existingFood != null) {
            existingFood.setFoodName(updatedFood.getFoodName());
            existingFood.setPrice(updatedFood.getPrice());
            
            existingFood.setAvailability(updatedFood.isAvailability());
            return foodRepository.save(existingFood);
        }
        return null;
    }

    public void deleteFood(int id) {
        foodRepository.deleteById(id);
    }
    
}
