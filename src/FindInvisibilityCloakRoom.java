public class FindInvisibilityCloakRoom extends LootRoom{
    public FindInvisibilityCloakRoom(int x, int y,InvisibilityCloak BigInvisibilityCloak){
        super(x,y,BigInvisibilityCloak);
    }
    public String intro_text(){
        return "You enter a special room and you starting searching for something special.\nYou found the Invisibility Cloak, You pick it up it felt powerful with invisible magic." +
                "\nYou unlocked the ability of 20 damage\n";
    }
    public void modify_player(Player player){

    }
}
