package theory.java.oopconcepts.abstraction.interfaces;

public class InterfaceDemo1{
    public static void main(String[] args) {
        CarsInterface myInterface  = new InterfaceDemo();
        InterfaceDemo myOtherInterface = new InterfaceDemo();
        myInterface.engineStart("6 Cyllinder", true);
        myOtherInterface.headsUpNavigation();
    }
}
