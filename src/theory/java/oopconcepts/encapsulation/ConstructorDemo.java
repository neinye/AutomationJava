package theory.java.oopconcepts.encapsulation;

public class ConstructorDemo {
    public static void main(String[] args) {
        ConstructorsAndEncapsulation ci = new ConstructorsAndEncapsulation();
        ci.setModel("newModel");
        System.out.println(ci.getModel());
        System.out.println("************************");
        ConstructorsAndEncapsulation co = new ConstructorsAndEncapsulation("BMW", 2012);
        System.out.println(co.getMake() + " " + co.getYear() + " " + co.getClass());
    }
}
