public class Dog extends Enemy{
    private  Spotting spotting_skill;
    public Dog(Spotting spotting_skill){
        super("Dog",20,15);
        this.spotting_skill = spotting_skill;
    }
}
