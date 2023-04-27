import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
public class World {
    // Class level variables
    public static String[][] _world; // two dimension array
    static Point Starting_Position = new Point(0,0);
    public static ArrayList<MapTile> history = new ArrayList<MapTile>();

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
                for (int x = 0; x < x_max && x < cols.length; x++) {
                    title_name = cols[x];
                    if (title_name.equals("StartingRoom")) {
                        Starting_Position.x = y;
                        Starting_Position.y = x;
                    }
                    _world[y][x] = title_name.equals(" ") ? null : title_name;
                }
            }
            System.out.println(_world);
        } //Closing try
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static MapTile title_exists(int x, int y){
        MapTile mt = null;



        if ((x >= 0 && x < _world.length) && (y >= 0 && y < _world[0].length)
                && _world[x][y] != null) {
            switch (_world[x][y]){
                case "StartingRoom":
                    mt = new StartingRoom(x,y);
                    mt = checkRoomExists(mt);
                    break;

                //Enemy Rooms:
                case "BoggartsRoom":
                    mt = new BoggartsRoom(x,y, new Boggarts(Size.Large));
                    mt = checkRoomExists(mt);
                    break;
                case "WerewolvesRoom":
                    mt = new WerewolvesRoom(x,y, new Werewolves(Spotting.Smelling));
                    mt = checkRoomExists(mt);
                    break;
                case "DementorsRoom":
                    mt = new DementorsRoom(x,y, new Dementors(Emotion.Fear));
                    mt = checkRoomExists(mt);
                    break;
                case "GoblinsRoom":
                    mt = new GoblinsRoom(x,y, new Goblins(Spray.acid_spray));
                    mt = checkRoomExists(mt);
                    break;
                case "VoldemortRoom":
                    mt = new VoldemortRoom(x,y,new Voldemort(Magic.Avada_Kedavra));
                    mt = checkRoomExists(mt);
                    break;

                //Weapons Room:
                case "FindSwordRoom":
                    mt = new FindSwordRoom(x,y,new Sword());
                    mt = checkRoomExists(mt);
                    break;
                case "FindShieldRoom":
                    mt = new FindShieldRoom(x,y,new Shield());
                    mt = checkRoomExists(mt);
                    break;
                case "FindInvisibilityCloakRoom":
                    mt = new FindInvisibilityCloakRoom(x,y,new InvisibilityCloak());
                    mt = checkRoomExists(mt);
                    break;
                case "FindWandRoom":
                    mt = new FindWandRoom(x,y,new Wand());
                    mt = checkRoomExists(mt);
                    break;

                // Treasury:
                case "TreasureRoom":
                    mt = new TreasureRoom(x,y,new Gold(10));
                    mt = checkRoomExists(mt);
                    break;

                // Empty & Exit room:
                case "EmptyAzkabanRoom":
                    mt = new EmptyAzkabanRoom(x,y);
                    mt = checkRoomExists(mt);
                    break;

                case "LeaveAzkabanRoom":
                    mt = new LeaveAzkabanRoom(x,y);
                    mt = checkRoomExists(mt);
                    break;
            }
        }
        return mt;
    }
    private static MapTile checkRoomExists(MapTile mt){
        if(history.indexOf(mt) != -1) {
            mt = history.get(history.indexOf(mt));
        }else {
            history.add(mt);
        }
        return mt;
    }

}
