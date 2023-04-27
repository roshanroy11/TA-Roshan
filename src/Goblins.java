public class Goblins extends Enemy{

    private Spray acid_spray;
    public Goblins(Spray acid_spray){
        super("Goblins",40,20);
        this.acid_spray = acid_spray;
    }
}