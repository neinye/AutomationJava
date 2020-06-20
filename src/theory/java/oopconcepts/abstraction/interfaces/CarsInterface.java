package theory.java.oopconcepts.abstraction.interfaces;

public interface CarsInterface {

    //it doesn't make much sense to define variables in Interfaces
    public String speed = "100";
    public void engineStart(String engineType, boolean isKeyLess);
}
