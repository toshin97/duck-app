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
public class FlyRocketPowered implements FlyBehavior {
    public String fly() {
        String fr = "I'm flying with a rocket!";
        System.out.println(fr);
        return fr;
        
    }
}
