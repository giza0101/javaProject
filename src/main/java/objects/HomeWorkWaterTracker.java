package objects;

public class HomeWorkWaterTracker {



    int consumedWater;

    public void setConsumedWater(int consumedWater) {
        this.consumedWater = consumedWater;
    }

    public void addWater(int milliliters) {
        consumedWater += milliliters;
    }

    public int getWaterIntake() {
        return consumedWater;
    }

    public String getStatus() {
        if (consumedWater >= 2000) {
            return "You are hydrated";

        }
        else{
            return "You need to drink" + (2000 - consumedWater) + "ml of water";
        }

    }

    public static void main(String[] args) {

    }
}








