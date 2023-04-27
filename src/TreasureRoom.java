public class TreasureRoom extends LootRoom {
    public TreasureRoom(int x, int y, Gold gold) {
        super(x, y, gold);
    }

    public String intro_text() {
        if (pickedItem == false)
            return String.format("A round shiny coin is found inside the room.\nYou collect the coin.\n You obtain 10 coins\n");
        else
            return "";
    }
}
