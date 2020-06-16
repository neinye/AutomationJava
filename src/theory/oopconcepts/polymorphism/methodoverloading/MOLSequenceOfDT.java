package theory.oopconcepts.polymorphism.methodoverloading;

/***
 * Method Overloading can be achieved by alternating the sequence of Data Types
 */
public class MOLSequenceOfDT {
    public static void main(String[] args) {
        setSeatHeight("true", 8);
        setSeatHeight(9, "hello");
    }

    public static void setSeatHeight(int variable1, String variable2){
        System.out.println("This is the first method.\nThe seat height is "+ variable1 + " and the text is: " + variable2);
    }
    public static void setSeatHeight(String variable2, int variable1){
        System.out.println("This is the second method.\nThe seat height is "+ variable1 + " and the text is: " + variable2);
    }

    //you can not do the same sequence and just change the names, compile time error
    //if you uncomment bellow, it will give an error

//    public static void setSeatHeight(String variable3, int variable4){
//        System.out.println("This is the third method.\nThe seat height is " + variable3 + " and the text is: " + variable4);
//    }

    //ALSO you can not overload just on the return type

//    public static int seatSeatHeight(String variable2, int variable1){
//        System.out.println("This is the third method");
//        return (variable1 * 2);
//    }

}
