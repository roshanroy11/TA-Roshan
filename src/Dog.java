public class Dog extends Enemy{
    private int smell_Strength;
    public Dog(int smell_Strength){
        super("Dog",20,15);
        this.smell_Strength = smell_Strength;
    }
}
