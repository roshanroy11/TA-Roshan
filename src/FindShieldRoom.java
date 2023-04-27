public class FindShieldRoom extends LootRoom{
    private Shield shield;
    public FindShieldRoom(int x,int y,Shield shield){
        super(x, y,shield);
    }

    public String intro_text(){
        return "You enter a special room and you starting searching for something special.\nYou found the Shield, You pick it up it felt powerful with protection of metal cover." +
                "\nYou unlocked the ability of 20 damage\n";

    }
}
