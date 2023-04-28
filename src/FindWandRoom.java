public class FindWandRoom extends LootRoom{
    private Wand wand;
    public FindWandRoom(int x,int y,Wand wand){
        super(x, y,wand);
        this.wand = wand;
    }

    public String intro_text(){
        return "You enter a special room and you starting searching for something special.\nYou found the Wand, You pick it up it felt powerful with a magic stick." +
                "\nYou unlocked the ability of 30 damage\n";

    }
}
