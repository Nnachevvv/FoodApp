package Models;

import Models.Food;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;

public class Person {

    private PersonInformation personInformation;
    private HashMap<LocalDate, LinkedList<Food>> foodEatenEveryDay;

    public Person(PersonInformation person)
    {
        this.personInformation = person;
        foodEatenEveryDay = new HashMap<>();
    }

    void addFoodEaten(String Name,Food food)
    {

        foodEatenEveryDay.put(LocalDate.now(),new LinkedList<>());
        foodEatenEveryDay.get(LocalDate.now()).add(food);

    }


}
