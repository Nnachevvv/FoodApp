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
        if(calories >= 0)
        {
            this.calories = calories;
        }
        else{
            //TO DO: VALIDATE OUTPUT
        }
    }


    private void setCarbohydrates(double carbohydrates)
    {
        if(carbohydrates >= 0)
        {
            this.carbohydrates = carbohydrates;
        }
        else{
            //TO DO: VALIDATE OUTPUT
        }
    }


    private void setFats(double fats)
    {
        if(fats >= 0)
        {
            this.fats = fats;
        }
        else{
            //TO DO: VALIDATE OUTPUT
        }
    }


    private void setProtein(double protein)
    {
        if(protein >= 0)
        {
            this.protein = protein;
        }
        else{
            //TO DO: VALIDATE OUTPUT
        }
    }

}
