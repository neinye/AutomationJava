package theory.java.oopconcepts.staticpack;


public class StaticDemo {
    public static void main(String[] args) {
        StaticExampleClass static1 = new StaticExampleClass("BMW");
        System.out.println("The manufacturer is: " + static1.getMake());
        System.out.println("This is the instance number: "+StaticExampleClass.getInstanceNum());

        StaticExampleClass static2 = new StaticExampleClass("Mercedes Benz");
        System.out.println("The manufacturer is: " + static2.getMake());
        System.out.println("This is the instance number: "+StaticExampleClass.getInstanceNum());

    }

}
