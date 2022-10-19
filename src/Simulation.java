import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {
    ArrayList<Item> loadItems(String pathname) throws FileNotFoundException {

        ArrayList<Item> listItem = new ArrayList<>();
        File file = new File(pathname);
        Scanner fileScanner = new Scanner(file);
        String[] lineSplit;

        while (fileScanner.hasNextLine()) {
            Item item = new Item();

            String line = fileScanner.nextLine();
            lineSplit = line.split("=");

            item.setName(lineSplit[0]);
            item.setWeight(Integer.valueOf(lineSplit[1]));
            listItem.add(item);

        }
        return listItem;
    }

    ArrayList<Rocket> loadU1(ArrayList<Item> listItem){
        ArrayList<Rocket> loadedU1Rockets = new ArrayList<>();
        Rocket u1Rocket = new U1();

        for(Item item:listItem){
            if (u1Rocket.canCarry(item)){
                u1Rocket.carry(item);
            }else{
                loadedU1Rockets.add(u1Rocket);
                u1Rocket = new U1();
                u1Rocket.carry(item);
            }

        }
        return loadedU1Rockets;
    }

    ArrayList<Rocket> loadU2(ArrayList<Item> listItem){
        ArrayList<Rocket> loadedU2Rockets = new ArrayList<>();
        Rocket u2Rocket = new U2();

        for(Item item:listItem){
            if (u2Rocket.canCarry(item)){
                u2Rocket.carry(item);
            }else{
                loadedU2Rockets.add(u2Rocket);
                u2Rocket = new U1();
                u2Rocket.carry(item);
            }

        }
        return loadedU2Rockets;
    }

    int runSimulation(ArrayList<Rocket> rockets){
        int totalBudget= 0;
        for (Rocket rocket: rockets){
            totalBudget =+ rocket.getCostRocket();
            while (!rocket.launch() && !rocket.land()){
                totalBudget =+ rocket.getCostRocket();
            }
        }
    return totalBudget;
    }
}
