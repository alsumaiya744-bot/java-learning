package com.example.food;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService {

    @Autowired
    private FoodRepository repo;

  
    public String addFood(FoodItem food) throws Exception {

        return repo.addFood(food) > 0
                ? "Food Added Successfully"
                : "Failed";
    }

    
    public String updateFood(int id, FoodItem food) throws Exception {

    return repo.updateFood(id, food) > 0
            ? "Food Updated Successfully"
            : "Update Failed";
}
  
    public FoodItem getById(int id) throws Exception {

        return repo.searchById(id);
    }


    public List<FoodItem> getAllFoods() throws Exception {

        return repo.getAllFoods();
    }

    
    public String deleteFood(int id) throws Exception {

        return repo.deleteFood(id) > 0
                ? "Food Deleted Successfully"
                : "Delete Failed";
    }
}