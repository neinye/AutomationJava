/*
 * In single inheritance, subclasses inherit the features of one superclass.
 */
package theory.oopconcepts.inheritance.single;
//this is the driver class
public class TestSI {

    public static void main(String[] args) {
        System.out.println("--------------------------------------\n\n\nBike below\n\n\n------------------------------");
        Bicycle b1 = new Bicycle(2, 15);
        b1.applyBrake(6);
        System.out.println(b1.toString() + "\n" + b1.newString());
        System.out.println("--------------------------------------\n\n\nMountain Bike below\n\n\n------------------------------");
        MountainBike mb1 = new MountainBike(3, 20, 10);
        mb1.speedUp(5);
        mb1.applyBrake(2);
        mb1.setHeight(7);
        System.out.println(mb1.toString() + "\n" + mb1.newString());
    }
}
