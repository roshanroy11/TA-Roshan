public class Joker extends Enemy{

    private Spray acid_spray;
    public Joker(Spray acid_spray){
        super("Joker",40,25);
        this.acid_spray = acid_spray;
    }
}
