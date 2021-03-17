package theory.java.oopconcepts.encapsulation;

public class ConstructorsAndEncapsulation {


    private String color;
    private String make;
    private String model;
    private int year;

    public void increaseSpeed(){
        System.out.println("Increasing the speed.");
    }

    //SETTERS
    public void setColor(String color){this.color = color;}
    public void setMake(String make){        this.make = make;    }
    public void setModel(String model){        this.model = model;    }
    public void setYear(int year){        this.year = year;    }
    //GETTERS
    public String getColor(){        return this.color;    }
    public String getMake(){        return this.make;    }
    public String getModel(){        return this.model;    }
    public int getYear(){        return this.year;    }
    //Constructor without arguments
    public ConstructorsAndEncapsulation() {
        System.out.println("Executing contructor without arguments");
    }
    //Constructor with arguments
    public ConstructorsAndEncapsulation(String make, int year) {
        this.make = make;
        this.year = year;
        System.out.println("Executing constructor with arguments");
    }

}
