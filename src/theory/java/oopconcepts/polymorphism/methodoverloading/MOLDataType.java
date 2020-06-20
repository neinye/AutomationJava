package theory.java.oopconcepts.polymorphism.methodoverloading;

/***
 * Method Overloading can be achieved by alternating data types
 */
public class MOLDataType {
    public static void main(String[] args) {
        setSeatHeight(5);
        System.out.println();
        setSeatHeight("6");
    }

    public static void setSeatHeight(int variable1){
        System.out.println("This is the int method.\nThe seat is set to " + variable1 + " inches");
    }
    public static void setSeatHeight(String variable1){
        System.out.println("This is the String method.\nThe seat is set to " + variable1 + " inches");
    }

}
