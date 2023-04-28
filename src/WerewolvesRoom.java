public class WerewolvesRoom extends EnemyRoom{

    private Werewolves labrador;
    public WerewolvesRoom(int x, int y,Werewolves labrador){
        super(x,y,labrador);
        this.labrador = labrador;
    }

    public String intro_text(){
        return "You look around and see a hungry labrador.\nIt is stairs at your eyes with its drooling mouth with hunger to eat, It starts running in two legs towards you" +
                "\nThe labrador snatched your face and you receive 10 damage.\n";
    }
    public void modify_player(Player player) {
        if (labrador.is_alive()) {
            player.hp = (short) (player.hp - labrador.damage);
            System.out.printf("The Enemy you are facing does %d Damage. You have %d Health Remaining...", labrador.damage, player.hp);
        }
    }

}
