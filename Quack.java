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
public class Quack implements QuackBehavior{
    public String quack() {
        String q = "Quack!";
        System.out.println(q);
        return q;
    }
}
