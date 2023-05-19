import java.util.ArrayList;

public class MyFarmArrayList {

    public ArrayList<Plot> row =  new ArrayList<Plot>();  ///array list
    public  MyFarmArrayList() {
        System.out.println("my farm using array list");


        System.out.println(row.size());

//        for(Plot a : row) {
//
//            System.out.println(row.size());
//            row.add(new Plot());
//            a.printPlot();
//        }

        for (int p = 0; p < 10; p++) {

            System.out.println(row.size());
            row.add(new Plot());
            row.get(p).printPlot();
        }
        //row.add(new Plot());

        System.out.println(row.size());
totalPlants();
printPlantNames();
addSunflower();
printPlantNames();
addCorn();
printPlantNames();
    }

    public void totalPlants() {
        int total = 0;
        for  (Plot a:row){
            total += a.NumberOfPlants;
        }
        System.out.println("total plants in my farm is " + total);
    }
    public void printPlantNames(){
        for(int k = 0; k < row.size(); k++){
            System.out.print(k + ": " + row.get(k).PlantName + "\t");
        }
        System.out.println();
    }
    public void addSunflower(){
        Plot sunflower = new Plot();
        sunflower.PlantName = "sunflower";
        sunflower.NumberOfPlants = 42;
        sunflower.NeedsWater = true;
        sunflower.printPlot();

        row.add(sunflower);

    }
    public void addCorn(){
        Plot corn = new Plot();
        corn.PlantName = "corn";
        corn.NumberOfPlants = 70;
        corn.NeedsWater = false;
        corn.printPlot();

        row.add(3, corn);

    }

}



