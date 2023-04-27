public class LeaveAzkabanRoom extends MapTile{
    public LeaveAzkabanRoom(int x, int y){
        super(x,y);
    }
    public String intro_text(){
        return "You have reached at room where there is a door which is glowing with bright light.\nYou are scared to Open but... You Open it!!" +
                "\nGuess what you have successful escaped the Azkaban and can go back to Hogwarts.\nCongratulation you have successfully finished the Game!!!\n";
    }
    public void modify_player(Player player){
        player.victory = true;
    }
}
