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
            //TODO VALIDATION
        }
    }

    public String getName() {
        return this.name;
    }

    public double getCalories()
    {
        return this.nutrients.getCalories();
    }

    @Override
    public int compareTo(@NotNull Food food) {
        return food.name.compareTo(this.name);
    }

    @Override
    public String toString()
    {
        return String.format(name + " " + nutrients.toString());
    }

}
