import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Simulation s = new Simulation();

        ArrayList<Rocket> u1RocketsPhase1 = s.loadU1(s.loadItems("phase-1.txt"));
        ArrayList<Rocket> u1RocketsPhase2 = s.loadU1(s.loadItems("phase-2.txt"));
        int rockets1Costs =+ s.runSimulation(u1RocketsPhase1) + s.runSimulation(u1RocketsPhase2);

        ArrayList<Rocket> u2RocketsPhase1 = s.loadU2(s.loadItems("phase-1.txt"));
        ArrayList<Rocket> u2RocketsPhase2 = s.loadU2(s.loadItems("phase-2.txt"));
        int rockets2Costs =+ s.runSimulation(u2RocketsPhase1) + s.runSimulation(u2RocketsPhase2);

        System.out.println("Rockets type U1 total budget $" + rockets1Costs);
        System.out.println("Rockets type U2 total budget $" + rockets2Costs);

    }
}