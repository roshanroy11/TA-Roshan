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
        Ogre greenOgre = new Ogre("Green");
        Ogre redOgre = new Ogre("Red");
        Zombie slowZombie = new Zombie(5);
        Zombie fastZombie = new Zombie(10);
        Dog spotDog = new Dog(15);
        Joker smartClown = new Joker(30);

    }
}