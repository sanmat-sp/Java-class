package abstraction;

public class wiring {
    public static void main(String[] args) {
//        ISwitchBoardListener i=new GEAppliances();
        ISwitchBoardListener i=new HavellsAppliances();
        i.switchOne();
        i.switchTwo();
        i.switchThree();
    }
}
