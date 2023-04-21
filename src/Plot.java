public class Plot {
    public String PlantName;
    public int NumberOfPlants;
    public boolean NeedsWater;

    public Plot(){
     //   PlantName = "basil";
        NeedsWater = true;
        NumberOfPlants = (int)(Math.random()*100)+10;
        int num = (int)(Math.random()*5);
        if (num==0){
            PlantName = "sunflower";
        } else if (num==1) {
            PlantName = "corn";

        }
    }
}
