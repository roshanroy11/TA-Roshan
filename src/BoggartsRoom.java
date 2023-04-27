public class BoggartsRoom extends MapTile {
    private Boggarts gianSpider;
    public BoggartsRoom(int x, int y, Boggarts giantSpider){
        super(x,y);
        this.gianSpider = giantSpider;
    }
    public String intro_text(){
        return "You enter a room and it is dark and siletn slowly you start hearing sound of many people moving .\nYou get nervous. When it comes close you see a huge thing with 8 legs!! Yup it is a huge Spider(Boggarts) and it is running quicly towards you" +
                "\nThe Boggarts attacks 15 damage. ";
    }
    public void modify_player(Player player){
    }

}

