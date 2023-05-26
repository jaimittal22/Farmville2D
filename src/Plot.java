public class Plot {
    public String PlantName;
    public int NumberOfPlants;
    public boolean NeedsWater;

    public Plot() {
        //   PlantName = "sunflower";
        NeedsWater = false;
        NumberOfPlants = (int) (Math.random() * 100) + 10;//random 10 110
        int num = (int) (Math.random() * 5);
        if (num == 0) {
            PlantName = "sunflower";
        } else if (num == 1) {
            PlantName = "corn";
        } else if (num == 2) {
            PlantName = "carrot";
        } else if (num == 3) {
            PlantName = "tomato";
        } else {
            PlantName = "empty";
            NumberOfPlants = 0;

        }
    }
    public void printPlot(){
        System.out.println("the plot has " + NumberOfPlants + " of " + PlantName + " and  " + NeedsWater);
    }
}

