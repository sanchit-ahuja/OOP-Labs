/**
 * RaceTrack
 */
public class RaceTrack {

    public static void main(String[] args) {
        Car c1 = new Car(2001,"Ford",30);
        System.out.println("Year " +c1.getYear() + "\n"
        + "Make " + c1.getMake() + "\n" + "Speed " + c1.getSpeed() +  "\n");
        c1.Accelerate();
        System.out.println("Speed now " + c1.getSpeed());
        c1.Accelerate(5);
        System.out.println("Speed now " + c1.getSpeed());
        c1.Break(4);
        System.out.println("Speed now " + c1.getSpeed());
        // Car c2 = new Car(); The constructor is undefined. Will have to define a default constructor

    }
}