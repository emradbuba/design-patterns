/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.guit4rfre4k.designpatterns.proxy.adapter;

/**
 *
 * @author ezmuzra
 */
public class Context {

    public static void main(String[] args) {

        Client c = new Client(new AdapterTargetToInit(new Component()));
        c.businnessAction();


    }

}
