package Tiere;

import Biome.Biome;
import World.Playground;

public class Hunter extends Animals {

    public Hunter(String name, double foodLVL, double waterLVL, int speed) {
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

    @Override
    public double searchingForFood(Biome randomBiom) {
        return 0;
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
