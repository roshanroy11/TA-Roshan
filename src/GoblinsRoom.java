public class GoblinsRoom extends EnemyRoom{
    private Goblins goblin;
    public GoblinsRoom(int x, int y,Goblins goblin){
        super(x,y,goblin);
        this.goblin = goblin;
    }

    public String intro_text(){
        return "You look around and see a cunning goblin.\nIt is looks ready to kill you, It is running towards you" +
                "\nThe goblin sprays acid on your body and you receive 20 damage"+
                "\nThe Goblins attacks 20 damage. ";
    }
    public void modify_player(Player player) {
        if (goblin.is_alive()) {
            player.hp = (short) (player.hp - goblin.damage);

            System.out.printf("The Enemy you are facing does %d Damage. You have %d Health Remaining...", goblin.damage, player.hp);


        }
    }
}
