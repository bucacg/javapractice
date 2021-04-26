package think.polymorphism.music.Cycle;

public class Ride {
    public static void ride(Cycle cycle){
        cycle.play();
    }
    public static void main(String[]args){
        Unicycle unicycle=new Unicycle();
        Bycycle bycycle=new Bycycle();
        Tricycle tricycle=new Tricycle();
        ride(unicycle);
        ride(bycycle);
        ride(tricycle);
    }
}
