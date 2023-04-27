public class EmptyAzkabanRoom extends MapTile{
    public EmptyAzkabanRoom(int x, int y){
        super(x,y);
    }
    public String intro_text(){
        return "You enter a strange room which only has four walls with four doors.\nYou look around and see nothing but just the four doors..." +
                "You have no choice to but chose one door \nWhich door do you choose.\n";
    }
    public void modify_player(Player player){

    }
}
