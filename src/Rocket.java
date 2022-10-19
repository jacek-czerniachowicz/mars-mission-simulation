import java.util.ArrayList;

public class Rocket implements SpaceShip {
    int weightRocket;
    int costRocket;
    int weightCurrent = weightRocket;
    int weightLimit;

    void setWeightRocket(int weightRocket){
        this.weightRocket = weightRocket;
    }
    int getWeightRocket(){
        return weightRocket;
    }
    void setCostRocket(int costRocket){
        this.costRocket = costRocket;
    }
    int getCostRocket(){
        return costRocket;
    }

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public final boolean canCarry(Item item) {
        return weightLimit >= weightCurrent + item.getWeight();

    }

    @Override
    public final void carry(Item item) {
        weightCurrent += item.getWeight();
    }
}
