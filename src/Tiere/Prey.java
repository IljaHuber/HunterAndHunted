package Tiere;

import Biome.Biome;
import World.Playground;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Prey extends Animals {
    public Prey(String name, double foodLVL, double waterLVL, int speed) {
        super(name, foodLVL, waterLVL, speed);
    }

    @Override
    public Biome searchBiomToEat(Playground playground) {
        int randomBiomIndex = (int)(playground.getBiomList().size() * Math.random());
        return playground.getBiomList().get(randomBiomIndex);
    }
    @Override
    public Biome searchBiomToDrink(Playground playground) {
        int randomBiomIndex = (int)(playground.getBiomList().size() * Math.random());
        return playground.getBiomList().get(randomBiomIndex);
    }
    public double searchingForFood(Biome randomBiom) {
        double food;
        if(Math.random() > randomBiom.getFoodOccurrence()) {
            food = 0.2;
        }
        else{
            food = - 0.1;
        }
        return food;
    }

    @Override
    public double searchingForWater(Biome randomBiom) {
        double water;
        if(Math.random() > randomBiom.getWaterOccurrence()) {
            water = 0.2;
        }
        else{
            water = - 0.1;
        }
        return water;
    }
}
