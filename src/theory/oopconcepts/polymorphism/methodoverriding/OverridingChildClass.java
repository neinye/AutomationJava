package theory.oopconcepts.polymorphism.methodoverriding;

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
