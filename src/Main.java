public class Main {
    public static void main(String[] args) {
        Item i1 = new Item("item name", "item desc", 10);
        Weapon w1 = new Weapon("weapon name", "weapon description", 10,20);
        Gold goldBar = new Gold(40);
        //Weapons:
        Sword magicSword = new Sword();
        Pillow softPillow = new Pillow();
        Mace bigMace = new Mace();
        //Enemies:
        Ogre greenOgre = new Ogre(Skin.Green);
        Ogre redOgre = new Ogre(Skin.Red);
        Zombie slowZombie = new Zombie(Speed.Slow);
        Zombie fastZombie = new Zombie(Speed.Fast);
        Dog spotDog = new Dog(Spotting.Smelling);
        Joker smartClown1 = new Joker(Spray.acid_spray);
        Joker smartClown2 = new Joker(Spray.poison_spray);
    }
}