/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.vassar.duck;

/**
 *
 * @author toshin
 */
public class NoFly implements FlyBehavior{
    public String fly() {
        String nf = "I can't fly!";
        System.out.println(nf);
        return nf;
    }
}
