public class StartingRoom extends MapTile {

    public StartingRoom(int x, int y){
        super(x,y);
    }
    public String intro_text(){
        return "Its a night day, loud noise of wind blowing..... \nYou were captured and brought to the deadly place called the AZKABAN. You have to escape the place and return to Hogwarts safely\nYour Journey to escape Azkaban Beings here\n";
    }
    public void modify_player(Player player){

    }

}
