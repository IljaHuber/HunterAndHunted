package Tiere;

import Biome.Biome;
import World.Playground;

import java.util.ArrayList;
import java.util.List;

public abstract class Animals {
    protected String name;
    protected double foodLVL;
    protected double waterLVL;
    protected int speed;

    public Animals (String name, double foodLVL, double waterLVL, int speed) {
        this.name = name;
        this.foodLVL = foodLVL;
        this.waterLVL = waterLVL;
        this.speed = speed;

    }
    public abstract Biome searchBiomToEat(Playground playground);
    public abstract Biome searchBiomToDrink(Playground playground);
    public boolean wantsToEat() {
        if(foodLVL < 0.7) {
            return true;
        }
        return false;
    }

    public double animalGetsHungry() {
        foodLVL -= 0.1;
        System.out.println(foodLVL);
        return foodLVL;
    }

    public boolean wantsToDrink() {
        if(waterLVL < 0.7) {
            return true;
        }
        return false;
    }

    public double animalGetsThirsty() {
        waterLVL -= 0.1;
        return waterLVL;
    }
    public abstract double searchingForFood(Biome randomBiom);
    public abstract double searchingForWater(Biome randomBiom);


    public String getName() {
        return name;
    }

    public double getFoodLVL() {
        return foodLVL;
    }

    public double getWaterLVL() {
        return waterLVL;
    }

    public int getSpeed() {
        return speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFoodLVL(double needsFood) {
        this.foodLVL = needsFood;
    }

    public void setWaterLVL(double needsWater) {
        this.waterLVL = needsWater;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public boolean checkIfFoodLVLIsCritical() {
        if(foodLVL <= 0) {
            return true;
        }
        return false;
    }

    public boolean checkIfWaterLVLIsCritical () {
        if(waterLVL <= 0) {
            return true;
        }
        return false;
    }
        public List<Animals> die() {
           List<Animals> deadAnimals = new ArrayList<>();
           if(checkIfFoodLVLIsCritical() || checkIfWaterLVLIsCritical()) {
               deadAnimals.add(Animals.this);
           }
        }
   public boolean ableToMakeLove() {
       if(waterLVL >= 0.7 && foodLVL >= 0.7) {
           return true;
       }
       return false;
   }
}

