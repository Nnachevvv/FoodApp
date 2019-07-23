package Models;

import java.io.*;
public class Nutrient {

    private double calories;
    private double carbohydrates;
    private double fats;
    private double protein;



    public Nutrient(double calories, double carbohydrates, double fats,double protein)
    {
        setCalories(calories);
        setCarbohydrates(carbohydrates);
        setFats(fats);
        setProtein(protein);
    }


    private void setCalories(double calories)
    {
        if(calories < 0)
        {
            //TODO validator class?
        }

        this.calories = calories;
    }



    private boolean setCarbohydrates(double carbohydrates)
    {
        if(carbohydrates >= 0)
        {
            this.carbohydrates = carbohydrates;
            return true;
        }
        return false;

    }

    public double getCalories()
    {
        return this.calories;
    }

    private void setFats(double fats)
    {
        if(fats >= 0)
        {
            this.fats = fats;
        }
        else{
            //TODO: VALIDATE OUTPUT
        }
    }


    private void setProtein(double protein)
    {
        if(protein >= 0)
        {
            this.protein = protein;
        }
        else{
            //TODO: VALIDATE OUTPUT
        }
    }

    @Override
    public String toString()
    {
        return String.format(calories + " " + carbohydrates + " " + protein +" "+ fats);
    }

}
