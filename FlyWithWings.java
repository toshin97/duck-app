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
public class FlyWithWings implements FlyBehavior {
    public String fly() {
        String fw = "I can fly with wings!";
        System.out.println(fw);
        return fw;
    }
}
