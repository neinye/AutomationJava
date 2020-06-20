package theory.java.oopconcepts.inheritance.single;

public class MountainBike extends Bicycle {

    public int seatHeight;
//Constructor of the MountainBike class which adds a new field to the ones of the superclass constructor
    public MountainBike(int gear, int speed, int startHeight){
        super(gear, speed);
        System.out.println("The Mountain Bike constructor");
        this.seatHeight = startHeight;
    }
    public void setHeight(int newValue){
        seatHeight = newValue;
    }
// PARTIALLY Overriding toString method
    @Override
    public String toString(){
        return(super.toString() + "\nthe height of the seat is " + seatHeight);
    }
//FULL Overriding newString method
    @Override
    public String newString(){
        return("This is the overriden method ");
    }
}
