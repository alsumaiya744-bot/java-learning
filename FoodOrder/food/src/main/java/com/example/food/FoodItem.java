package com.example.food;

public class FoodItem 
{
    private int id;
    private String foodName;
    private double price;
    private String category;
    private boolean availability;

    public FoodItem() {
    }

    public FoodItem(int id, String foodName,
                    double price,
                    String category,
                    boolean availability) {
        this.id = id;
        this.foodName = foodName;
        this.price = price;
        this.category = category;
        this.availability = availability;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
