package theory.java.oopconcepts.staticpack;

class StaticExampleClass {
    private String make;
    private static int instanceNum = 0; //belongs to the class and not the class instance; and is unique

    StaticExampleClass(String make){
        this.make = make;
        instanceNum++;
    }

    String getMake(){
        return make;
    }


    static int getInstanceNum(){
        return instanceNum;
    }
}
