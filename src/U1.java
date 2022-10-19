public class U1 extends Rocket{
    int costRocket = 100000000;
    int weightRocket = 10000;
    int weightLimit = 18000;

    U1(){
        setWeightRocket(weightRocket);
        setCostRocket(costRocket);
    }
    //Chance of launch explosion = 5% * (cargo carried / cargo limit)
    //Chance of landing crash = 1% * (cargo carried / cargo limit)

    public boolean launch(){
        double chanceExplosion = 0.05 * (getWeightRocket()/weightLimit) * 100;
        double randomNumber = Math.random() * 100;
        return chanceExplosion < randomNumber;
    }
    public boolean land() {
        double chanceCrash = 0.01 * (getWeightRocket() / weightLimit) * 100;
        double randomNumber = Math.random() * 100;
        return chanceCrash < randomNumber;
    }
}
