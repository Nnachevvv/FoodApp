package Models;

import org.jetbrains.annotations.NotNull;

public class Food implements  Comparable<Food> {

    private String name;

    private Nutrient nutrients;

    public Food(String name, Nutrient nutrients)
    {
        setName(name);
        this.nutrients = nutrients;
    }

    private void setName(String name)
    {
        if(name != null && !name.trim().isEmpty())
        {
            this.name = name;
        }
        else
        {
            //TO DO VALIDATION
        }
    }


    @Override
    public int compareTo(@NotNull Food food) {
        return food.name.compareTo(this.name);
    }
}
