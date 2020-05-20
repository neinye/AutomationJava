package theory.oopconcepts.abstraction.abstractclass;

import theory.oopconcepts.abstraction.abstractclass.AbstractCars;

public class AbstractDemoBMW extends AbstractCars {

    public void setPrivateSpeed(int speed){
        super.setPrivateSpeed(speed);
    }

    public void engineStart(){
        super.engineStart();
        System.out.println("Some added functionality to the original one");
    }

    /*if the abstract class contains an abstract method, that method SHOULD be implemented by the class
    * which extends it*/

//    @Override
//    public void engineStart(){
//        System.out.println("Some functionality");
//    }
}
