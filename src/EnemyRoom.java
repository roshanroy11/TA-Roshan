public class EnemyRoom extends MapTile{
    private Enemy enemy;

    public EnemyRoom(int x, int y, Enemy enemy){
        super(x,y);
        this.enemy = enemy;
    }
    public void modify_player(Player player) {
        if (enemy.is_alive()){
            player.hp = (short) (player.hp - enemy.damage);
            System.out.printf("The enemy you are being attacked does %d damage. You only have %d health remaining...", enemy.damage, player.hp);
        }
    }


}
