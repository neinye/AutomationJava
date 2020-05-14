package theory.oopconcepts.encapsulation;

public class ClassDemo {

    public static void main(String[] args) {
        ConstructorsAndEncapsulation bmw = new ConstructorsAndEncapsulation();// create and initialize a new object
        bmw.setColor("blu");
        bmw.setMake("BMW");
        bmw.setModel("YHG781");
        bmw.setYear(1995);

        System.out.println("The new car has the following characteristics:\n"+bmw.getColor()+"\n"+bmw.getMake()+"\n"+bmw.getModel()+"\n"+bmw.getYear());
    }

}
