public class Zombie extends Enemy{

    private Speed speed;
    public Zombie(Speed speed){
        super("Zombie",20,15);
        this.speed = speed;
    }
}
