/*
* In Hierarchical Inheritance, one class serves as a superclass
* (base class) for more than one sub class.
*/
package theory.oopconcepts.inheritance.hierarchical;

public class TestHI {
    public static void main(String[] args) {
        Three three = new Three();
        Two two = new Two();
        three.print_hello();
        two.print_geek();
        two.print_for();
        three.print_geek();
    }
}
