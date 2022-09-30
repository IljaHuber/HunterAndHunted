package Biome;

public abstract class Biome {
    protected double foodOccurrence;
    protected double waterOccurrence;


    public Biome (double foodOccurrence, double waterOccurrence) {
        this.foodOccurrence = foodOccurrence;
        this.waterOccurrence = waterOccurrence;
    }

    public double getFoodOccurrence() {
        return foodOccurrence;
    }

    public void setFoodOccurrence(double foodOccurrence) {
        this.foodOccurrence = foodOccurrence;
    }

    public double getWaterOccurrence() {
        return waterOccurrence;
    }

    public void setWaterOccurrence(double waterOccurrence) {
        this.waterOccurrence = waterOccurrence;
    }
}
