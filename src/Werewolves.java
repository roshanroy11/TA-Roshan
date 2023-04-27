public class Werewolves extends Enemy{
    private  Spotting spotting_skill;
    public Werewolves(Spotting spotting_skill){
        super("Werewolves",20,10);
        this.spotting_skill = spotting_skill;
    }
}
