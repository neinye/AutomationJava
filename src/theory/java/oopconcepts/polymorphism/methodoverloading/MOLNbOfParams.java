package theory.java.oopconcepts.polymorphism.methodoverloading;

/***
 * Method Overloading can be achieved through placing a different number of parameters in each method
 * with the same name
 */
public class MOLNbOfParams {
    public static void main(String[] args) {
        setSeatHeight(6, "Hello World!!!");
        setSeatHeight(9);
    }

    public static void setSeatHeight(int heightToIncrease){
        System.out.println("----------\n----------\n~~Method number 1.~~\nSetting height to " + heightToIncrease + " inches.");
    }

    public static void setSeatHeight(int heightToIncrease, String newMessage){
        System.out.println("----------\n----------\nMethod number 2.\nSetting height to " + heightToIncrease + " inches.\n"+ newMessage);
    }
}
