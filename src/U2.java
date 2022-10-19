public class U2 extends Rocket{
    int cost = 120000000;
    int weightRocket = 18000;
    int weightLimit = 29000;

    U2(){
        setWeightRocket(weightRocket);
        setCostRocket(costRocket);
    }
    //Chance of launch explosion = 4% * (cargo carried / cargo limit)
    //Chance of landing crash = 8% * (cargo carried / cargo limit)

    public boolean launch(){
        double chanceExplosion = 0.04 * (weightCurrent/weightLimit) * 100;
        double randomNumber = Math.random() * 100;
        return chanceExplosion < randomNumber;
    }
    public boolean land() {
        double chanceCrash = 0.08 * (weightCurrent / weightLimit) * 100;
        double randomNumber = Math.random() * 100;
        return chanceCrash < randomNumber;

    }

}
