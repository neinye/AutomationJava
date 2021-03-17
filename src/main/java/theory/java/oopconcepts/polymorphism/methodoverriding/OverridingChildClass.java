package theory.java.oopconcepts.polymorphism.methodoverriding;

/***
 * RULES:
 * 1. Arguments List: Arguments list in the overriding method should be the same as in the parent class overridden method
 * 2. Access Modifier: The access modifier of the overriding method cannot be more restrictive than the overridden method
 * 3. private, static and final methods cannot be overridden as they are local to the class
 */
public class OverridingChildClass extends OverridingParentClass{
    public static void main(String[] args) {
        OverridingChildClass c1 = new OverridingChildClass();
        c1.engineStart(2);
    }

    @Override
    public void engineStart(int cyl) {
        System.out.println("Hello");
        super.engineStart(cyl);
        System.out.println("And this is from the child class");
    }
}
