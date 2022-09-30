package AnimalLists;

import Tiere.*;

import java.util.ArrayList;
import java.util.List;

public class AnimalList {
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
    private List<Animals> allAnimalsList = createAllAnimalsList(wolf, bunny, pig, sheep);
    private List<Animals> huntedAnimalsList = createHuntedAnimalsList(bunny, pig, sheep);
    private List<Animals> brutalHuntersAnimalsList = createBrutalHuntersAnimalsList(wolf);

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

}

