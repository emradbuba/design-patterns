package io.github.guit4rfre4k.designpatterns.singleton;

import java.util.LinkedList;
import java.util.List;

public class Context {

    public static void main(String[] args) {
        List<TheSingletonClass> singletons = new LinkedList<>();
        singletons.add(TheSingletonClass.getInstance());
        singletons.add(TheSingletonClass.getInstance());
        singletons.add(TheSingletonClass.getInstance());
        singletons.add(TheSingletonClass.getInstance());
        singletons.add(TheSingletonClass.getInstance());
        singletons.forEach(System.out::println);
    }

}
