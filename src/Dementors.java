public class Dementors extends Enemy{
    private Emotion feelings;
    public Dementors(Emotion feelings){
        super("Dementors",30,15);
        this.feelings = feelings;
    }
}
