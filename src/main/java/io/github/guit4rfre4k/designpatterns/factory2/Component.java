/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.guit4rfre4k.designpatterns.factory2;

/**
 *
 * @author guit4rfre4k
 */
public class Component implements IComponent {

    private final String name;

    public Component(String name) {
        this.name = name;
    }

    public void action() {
        System.out.println("Action from " + name);
    }

}
