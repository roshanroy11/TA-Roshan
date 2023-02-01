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
        Ogre greenOgre = new Ogre();
        Ogre redOgre = new Ogre();
        Zombie slowZombie = new Zombie();
        Zombie fastZombie = new Zombie();
        Dog spotDog = new Dog();
        Joker smartClown = new Joker();

    }
}