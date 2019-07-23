package Models;

import Models.Food;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;

public class Person {

    private PersonInformation personInformation;
    private HashMap<LocalDate, ArrayList<Food>> foodEatPerDay;

    public Person(PersonInformation person)
    {
        this.personInformation = person;
        foodEatPerDay = new HashMap<>();
    }

    public void addFoodEaten(String Name,Food food)
    {
        if(!foodEatPerDay.containsKey(LocalDate.now()))
        {
            foodEatPerDay.put(LocalDate.now(),new ArrayList<>());
            foodEatPerDay.get(LocalDate.now()).add(food);
        }else{
            foodEatPerDay.get(LocalDate.now()).add(food);
        }
    }


    public void getFoodEatenPerDay(LocalDate date)
    {
        System.out.println(personInformation.toString());
        System.out.println(date);

        if(!foodEatPerDay.containsKey(date))
        {
            System.out.println("No food eaten this day!");
        }
        else {
            for (var foodEaten : foodEatPerDay.get(date)) {
                System.out.println(foodEaten.toString());
            }
        }
    }

    public Integer calculateDateCalories(LocalDate date)
    {
        //TODO  print outside of class
        int calories = 0;
        if(!foodEatPerDay.containsKey(date))
        {
            return calories;
        }
        else {

            for (Food food :
                 foodEatPerDay.get(date)) {
                calories += food.getCalories();
            }
        }
        return calories;

    }



}
