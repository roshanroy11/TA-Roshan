public class VoldemortRoom extends EnemyRoom{
    private Voldemort villian;
    public VoldemortRoom(int x, int y, Voldemort villian){
        super(x,y,villian);
        this.villian = villian;
    }
    public String intro_text(){
        return "You enter a room where you see the main villain VOLDEMORT\nHe attacks you with his Killing Curse Magic" +
                "\nThe Voldemort attacks 25 damage.\n";
    }
    public void modify_player(Player player){

    }
}
