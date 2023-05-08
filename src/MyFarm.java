import javax.naming.Name;

public class MyFarm {
    public static void main(String[] arge) {
        MyFarm charlie = new MyFarm();
    }

    public Plot[][] grid;

    public MyFarm() {
        System.out.println("Hello from my farm!");
        Plot Jai = new Plot();
        Jai.printPlot();

        grid = new Plot[4][5];

        for (int n = 0; n < grid.length; n++) {
            for (int r = 0; r < grid[n].length; r++) {
                grid[n][r] = new Plot();
                grid[n][r].printPlot();
            }
        }
        totalPlants();
        printPlantNames();
        totalCarrots();
        //  averageNumberofPlants();
        plotWithMaxNumber();
        plantWithMaxNumber();
    }

    public void totalPlants() {
        //how many total plants are there in the grid?
        int sumOfPlants = 0;

        for (int e = 0; e < grid.length; e++) {
            for (int c = 0; c < grid[e].length; c++) {
                System.out.println(grid[e][c].NumberOfPlants);
            }

        }

    }

    public void printPlantNames() {
        // print the name of each plant in each row and column
        // row: 0 col: 0 corn
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                System.out.println("row:" + r + "col:" + c + " " + grid[r][c].PlantName);
            }


        }

    }

    public void totalCarrots() {
        int sumOfCarrots = 0;
        for (int h = 0; h < grid.length; h++) {
            for (int k = 0; k < grid[h].length; k++) {
                if (grid[h][k].PlantName.equals("carrot")) {
                    sumOfCarrots += grid[h][k].NumberOfPlants;
                }
            }
        }
        System.out.println("The total carrots are " + sumOfCarrots);
    }

    public void averageNumberofPlants() {
        int numOfPlants = 0;
        int totalPlants = 0;
        for (int e = 0; e < grid.length; e++) {
            for (int c = 0; c < grid[e].length; c++) {
                numOfPlants += grid[e][c].NumberOfPlants;
                totalPlants = e * c;
            }
            System.out.println("the average number of plants is" + numOfPlants / totalPlants);
        }
    }

    public void numberOfTomatoPlants() {

    }

    public void plotWithMaxNumber() {
        // which plot type has the most total plants?
        int maxNumber = grid[0][0].NumberOfPlants;
        String name = grid[0][0].PlantName;
        for (int b = 0; b < grid.length; b++) {
            for (int g = 0; g < grid[b].length; g++) {
                if (grid[b][g].NumberOfPlants > maxNumber) {
                    maxNumber = grid[b][g].NumberOfPlants;
                    name = grid[b][g].PlantName;

                }
            }
        }
        System.out.println(name + " has the most plants with a total of " + maxNumber + "plants");
    }

    public void plantWithMaxNumber() {
        // which plant type has the most total plants?
        int numCorn = 0;
        int numTomato = 0;
        int numCarrot = 0;
        int numSunflower = 0;

        for (int b = 0; b < grid.length; b++) {
            for (int g = 0; g < grid[b].length; g++) {
                switch (grid[b][g].PlantName){
                    case "corn":
                        numCorn+= grid[b][g].NumberOfPlants;
                        break;
                    case "tomato":
                        numTomato+= grid[b][g].NumberOfPlants;
                        break;
                    case "sunflower":
                        numSunflower+= grid[b][g].NumberOfPlants;
                        break;
                    default:
                        numCarrot+= grid[b][g].NumberOfPlants;
                        break;
                }
            }
        }
        if(numCorn> numCarrot && numCorn> numSunflower && numCorn>numTomato){
            System.out.println("Corn has the most plants with "+numCorn+" plants");
        }
        if(numTomato> numCarrot && numTomato> numSunflower && numTomato>numCorn){
            System.out.println("Tomato has the most plants with "+numTomato+" plants");
        }
        if(numCarrot> numTomato && numCarrot> numSunflower && numCarrot>numCorn){
            System.out.println("Carrot has the most plants with "+numCarrot+" plants");
        }
        if(numSunflower> numTomato && numSunflower> numCarrot && numSunflower>numCorn){
            System.out.println("Sunflower has the most plants with "+numSunflower+" plants");
        }
    }
}