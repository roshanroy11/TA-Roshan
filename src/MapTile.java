import java.awt.Point;
import java.util.ArrayList;
public class MapTile {
    private int x;
    private int y;

    public MapTile(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result * x;
        result = prime * result * y;
        return prime;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MapTile other = (MapTile) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }

    public ArrayList<Action> adjacent_moves() {
        ArrayList<Action> moves = new ArrayList<Action>();
        if (World.title_exists(x, y + 1) != null)
            moves.add(new FlyEast()); // moves east
        if (World.title_exists(x, y - 1) != null)
            moves.add(new FlyWest()); // moves west
        if (World.title_exists(x - 1, y) != null)
            moves.add(new FlyNorth()); // moves north
        if (World.title_exists(x + 1, y) != null)
            moves.add(new FlySouth()); // moves south
        return moves;
    }
    public ArrayList<Action> available_actions() {
        ArrayList<Action> move = new ArrayList<>();
        move = adjacent_moves();
        move.add(new ViewInventory());
        return move;
    }
    public String intro_text(){
        return null;
    }
    public void modify_player(Player player){
    }
}
