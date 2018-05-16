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
public class Mute implements QuackBehavior {
    public String quack() {
        String m = " < silence > ";
        System.out.println(m);
        return m;
        
    }
}
