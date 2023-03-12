import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
public class World {
    // Class level variables
    public static String[][] _world; // two dimension array
    static Point Starting_Position = new Point(0,0); //point start and end (x and y)
    public static ArrayList<MapTile> history = new ArrayList<MapTile>(); //ArrayList(add or remove to list), < > (angle bracket- Generics)

    public void load_tiles(){
        List<String> rows = new ArrayList<String>();
        try{//Reading map.txt
            BufferedReader f = new BufferedReader(new FileReader("src/map.txt"));
            String row;
            while ((row = f.readLine()) != null) {
                rows.add(row);
            }
            f.close();// Closing file
            int x_max = rows.get(0).split("\t").length;
            _world = new String[rows.size()][x_max];
            String[] cols;
            String title_name;
            //Nested function for two-dimensional for loop
            // control loop
            for (int y = 0; y < rows.size(); y++) {
                cols = rows.get(y).split("\t");
                // Counter control loop
                for (int x = 0; x < x_max; x++) {
                    title_name = cols[x];
                    if (title_name.equals("StartingRoom")) {
                        Starting_Position.x = y;
                        Starting_Position.y = x;
                    }
                    _world[y][x] = title_name.equals(" ") ? null : title_name;
                }
            }
        } //Closing try
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static MapTile title_exists(int x, int y){
        MapTile mt = null;
        return mt;
    }

}
