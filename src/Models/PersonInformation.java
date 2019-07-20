package Models;

import Enums.Gender;
import Enums.PhysicalActivity;

public class PersonInformation {

    private String name;
    private int age;
    private PhysicalActivity activity;
    private Gender gender;
    private double calories_needed;
    private double height;
    private double weight;

    public PersonInformation(String name ,int age ,int calories_needed,double height, double weight)
    {
        setName(name);
        setAge(age);
        setCaloriesNeeded();
        //setHeight();
        //setWeight();
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

    private void setAge(int age)
    {
        if(age<0)
        {

        }
        this.age = age;
    }


    private void setCaloriesNeeded()
    {
        double resting_energy = getRestingEnergy();
        if(gender.equals(Gender.FEMALE))
        {
            if(activity.equals(PhysicalActivity.LESS_THAN_3_TIMES))
            {
                calories_needed =resting_energy * 1.11;
            }
            else if(activity.equals(PhysicalActivity.THREE_TO_FIVE))
            {
                calories_needed =resting_energy * 1.25;

            }
            else{
                calories_needed = resting_energy * 1.45;
            }
        }
        else{
            if(activity.equals(PhysicalActivity.LESS_THAN_3_TIMES))
            {
                calories_needed =resting_energy * 1.12;
            }
            else if(activity.equals(PhysicalActivity.THREE_TO_FIVE))
            {
                calories_needed =resting_energy * 1.27;
            }
            else{
                calories_needed = resting_energy * 1.47;
            }

        }
    }


    private double getRestingEnergy()
    {
        double resting_energy = ((10 * weight) + (6.25 * height)) - (5 * age) - 161;
        if(gender.equals(Gender.FEMALE))
        {
            resting_energy -= 161 ;
        }else{
            resting_energy += 5 ;
        }
        return resting_energy;
    }


}
