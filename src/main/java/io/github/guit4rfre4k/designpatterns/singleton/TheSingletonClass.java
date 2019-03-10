package io.github.guit4rfre4k.designpatterns.singleton;

public class TheSingletonClass {

    private static int idGen = 1;
    private final int id;

    private static TheSingletonClass theInstance;

    private TheSingletonClass(){
        id = idGen++;
    }

    public static TheSingletonClass getInstance() {
        if(theInstance == null) {
            theInstance = new TheSingletonClass();
        }
        return theInstance;
    }

    @Override
    public String toString() {
        return "TheSingletonClass{" +
                "id=" + id +
                '}';
    }
}
