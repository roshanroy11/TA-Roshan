public class FindSwordRoom extends LootRoom{
    private Sword sword;
    public FindSwordRoom(int x,int y,Sword sword){
        super(x, y,sword);
    }

    public String intro_text(){
        return "You enter a special room and you starting searching for something special.\nYou found the Sword, You pick it up it felt powerful with sharp long weapon." +
                "\nYou unlocked the ability of 10 damage\n";

    }
}
