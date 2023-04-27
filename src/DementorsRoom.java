public class DementorsRoom extends MapTile{
    private Dementors ghost;
    public DementorsRoom(int x, int y, Dementors ghost){
        super(x,y);
        this.ghost = ghost;
    }
    public String intro_text(){
        return "You enter a room where you see nothing but you feeling something is there in the room.\nYou get nervous. Then you see a Dementors(Ghost) is coming closer to you and starts making you feel feared" +
                "\nThe Dementors attacks 15 damage. ";
    }
    public void modify_player(Player player){

    }

}
