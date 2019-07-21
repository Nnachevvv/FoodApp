package Models;

import Models.Food;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;

public class Person {

    private PersonInformation personInformation;
    private HashMap<LocalDate, ArrayList<Food>> foodEatenEveryDay;

    public Person(PersonInformation person)
    {
        this.personInformation = person;
        foodEatenEveryDay = new HashMap<>();
    }

    public void addFoodEaten(String Name,Food food)
    {
        if(!foodEatenEveryDay.containsKey(LocalDate.now()))
        {
            foodEatenEveryDay.put(LocalDate.now(),new ArrayList<>());
            foodEatenEveryDay.get(LocalDate.now()).add(food);
        }else{
            foodEatenEveryDay.get(LocalDate.now()).add(food);
        }
    }


    public void getFoodEatenPerDay(LocalDate date)
    {
        System.out.println(personInformation.toString());
        System.out.println(date);

        if(!foodEatenEveryDay.containsKey(date))
        {
            System.out.println("No food eaten this day!");
        }
        else {
            for (var foodEaten : foodEatenEveryDay.get(date)) {
                System.out.println(foodEaten.toString());
            }
        }
    }




}
