import Models.Food;

import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class FoodSystem {


    private TreeMap<String,Food> foods;

    public FoodSystem()
    {

        foods = new TreeMap<>();
    }

    public void addFood(Food food)
    {
        foods.put(food.getName(),food);
    }

    public Food getFood(String name)
    {
        return foods.get(name);
    }













}
