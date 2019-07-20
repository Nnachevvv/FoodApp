package Models;

import Models.Food;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;

public class Person {

    private PersonInformation personInformation;
    private HashMap<Date, LinkedList<Food>> foodEatenEveryDay;

    public Person()
    {
        foodEatenEveryDay = new HashMap<>();
    }








}
