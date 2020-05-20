package theory.oopconcepts.abstraction.abstractclass;

public abstract class AbstractCars {
    private int privateSpeed;
    public int publicSpeed;
    protected int protectedSpeed;

    int speedLimit = 100;

    public AbstractCars(){
        this(0);
    }
    public AbstractCars(int startSpeed){
        this.privateSpeed = startSpeed;
    }
    public void setPrivateSpeed(int pSpeed){
        this.privateSpeed = pSpeed;
    }
    public void engineStart(){
        System.out.println("Engine is started");
    }
    /*if the method is abstract, it SHOULD NOT have a body
    it leaves the implementation to the classes extending the abstract class*/

//    public abstract void engineStart(){
//        System.out.println("Engine is started");
//    }

}
