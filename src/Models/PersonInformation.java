package Models;

import Enums.Gender;
import Enums.PhysicalActivity;

public class PersonInformation {

    private String name;
    private int age;
    private PhysicalActivity activity;
    private double calories_needed;
    private double height;
    private double weight;
    private Gender gender;

    public PersonInformation(String name ,int age ,int calories_needed,double height, double weight,String gender)
    {
        setName(name);
        setAge(age);
        setCaloriesNeeded();
        setHeight(height);
        setWeight(weight);
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

    private void setGender(String gender)
    {
        gender = gender.toLowerCase();
        if(gender.equals("male"))
        {
            this.gender = Gender.MALE;
        }else if(gender.equals("female"))
        {
            this.gender = Gender.FEMALE;
        }else{

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
                this.calories_needed =resting_energy * 1.11;
            }
            else if(activity.equals(PhysicalActivity.THREE_TO_FIVE))
            {
                this.calories_needed =resting_energy * 1.25;

            }
            else{
                this.calories_needed = resting_energy * 1.45;
            }
        }
        else{
            if(activity.equals(PhysicalActivity.LESS_THAN_3_TIMES))
            {
                this.calories_needed =resting_energy * 1.12;
            }
            else if(activity.equals(PhysicalActivity.THREE_TO_FIVE))
            {
                this.calories_needed =resting_energy * 1.27;
            }
            else{
                this.calories_needed = resting_energy * 1.47;
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


    private void setHeight( double height)
    {
        if(height<0 || height>300)
        {

        }
        this.height = height;
    }
    private void setWeight( double weight)
    {
        if(height<0 || height>700)
        {

        }
        this.weight = weight;
    }
}
