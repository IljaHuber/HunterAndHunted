package World;

import Biome.*;
import Tiere.*;

import java.util.ArrayList;
import java.util.List;

public class Playground {
    private static int daysToSurvive = 100;
    private Biome desert = createDesert();
    private Biome grasslands = createGrasslands();
    private Biome woods = createWoods();
    private List<Biome> biomList = createBiomesList(desert, grasslands, woods);
    private Animals bunny = createBunny();
    private Animals pig = createPig();
    private Animals sheep = createSheep();
    private Animals wolf = createWolf();
    private List<Animals> allAnimalsList = createAllAnimalsList(wolf, bunny, pig, sheep);
    private List<Animals> huntedAnimalsList = createHuntedAnimalsList(bunny, pig, sheep);
    private List<Animals> brutalHuntersAnimalsList = createBrutalHuntersAnimalsList(wolf);
    public Playground() {
        biomList = createBiomesList(desert, grasslands, woods);
    }
    public List<Biome> getBiomList() {
        return biomList;
    }

    public static void main(String[] args) {

        Playground world = createWorld();
        world.animalsEatAndDrink(world.huntedAnimalsList);
        world.animalsEatAndDrink(world.brutalHuntersAnimalsList);

    }

    private void animalsEatAndDrink(List<Animals> animalsList) {
        for (int i = 0; i < daysToSurvive ; i++) {
            for(Animals animal : animalsList) {
                drinking(animal);
                animal.animalGetsThirsty();
                eating(animal);
                animal.animalGetsHungry();
            }
        }
    }
    private static Biome createDesert() {
        Biome desert = new Desert();
        return desert;
    }
    private static Biome createGrasslands() {
        Biome grasslands = new Grasslands();
        return grasslands;
    }

    private static Biome createWoods() {
        Biome woods = new Woods();
        return woods;
    }

    private static Animals createWolf() {
        Animals wolf = new Wolf();
        return wolf;
    }

    private static Animals createSheep() {
        Animals sheep = new Sheep();
        return sheep;
    }

    private static Animals createPig() {
        Animals pig = new Pig();
        return pig;
    }

    private static Animals createBunny() {
        Animals bunny = new Bunny();
        return bunny;
    }
    private static Playground createWorld() {
        Playground world = new Playground();
        return world;
    }
    private static List<Biome> createBiomesList(Biome desert, Biome grasslands, Biome woods) {
        List<Biome> biomList = new ArrayList<>();
        biomList.add(desert);
        biomList.add(grasslands);
        biomList.add(woods);
        return biomList;
    }
    private static List<Animals> createAllAnimalsList(Animals wolf , Animals bunny, Animals pig, Animals sheep) {
        List<Animals> allAnimalsList = new ArrayList<>();
        allAnimalsList.add(wolf);
        allAnimalsList.add(bunny);
        allAnimalsList.add(pig);
        allAnimalsList.add(sheep);
        return allAnimalsList;
    }

    private static List<Animals> createBrutalHuntersAnimalsList(Animals wolf) {
        List<Animals> brutalHuntersAnimalsList = new ArrayList<>();
        brutalHuntersAnimalsList.add(wolf);
        return brutalHuntersAnimalsList;
    }

    private static List<Animals> createHuntedAnimalsList(Animals bunny, Animals pig, Animals sheep) {
        List<Animals> huntedAnimalsList = new ArrayList<>();
        huntedAnimalsList.add(bunny);
        huntedAnimalsList.add(pig);
        huntedAnimalsList.add(sheep);
        return huntedAnimalsList;
    }

    private void eating(Animals animal) {
        if (animal.wantsToEat()) {
            animal.setFoodLVL(animal.getFoodLVL() + animal.searchingForFood(animal.searchBiomToEat(this)));
        }
    }

    private void drinking(Animals animal) {
        if(animal.wantsToDrink()) {
            animal.setWaterLVL(animal.getWaterLVL() + animal.searchingForWater(animal.searchBiomToDrink(this)));
        }
    }

}
