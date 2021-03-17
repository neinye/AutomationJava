/*
* In Multilevel Inheritance, a derived class will be inheriting a base class and
* as well as the derived class also act as the base class to other class.
*/
package theory.java.oopconcepts.inheritance.multilevel;

public class TestMLI {
    public static void main(String[] args) {
        Three three = new Three();
        three.print_hello();
        three.print_geek();
        three.print_for();
        three.print_geek();
    }
}
