package theory.java.oopconcepts.staticpack;

public class StaticKeynotesDemo {

    /***
     *   Static method cannot use the non-static variable or method directly - have to transform those to static,
     *      else create an instance
     *   "this" and "super" keywords cannot be used in static context
     */

    private int addNum = 10;
    private static int addNumStatic = 10;

    public static void main(String[] args) {
        StaticKeynotesDemo sknd = new StaticKeynotesDemo();
        int output = sknd.sum(20);  // here was created an instance of the object
        int staticOutput = sumStatic(10); // here we transformed the variable and the method to static ones
        System.out.println("The output from the created instance is: " + output);
        System.out.println("The output from the static methods and variables is: " + staticOutput);
    }

    private int sum(int number){
        return number + addNum;
    }

    private static int sumStatic(int number){
        return number + addNumStatic;
    }

}
