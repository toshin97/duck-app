/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.vassar.duck;
import java.io.*;
import java.util.*;
/**
 *
 * @author Tahsin Oshin
 */
public class SortByLength implements Comparator<Duck> {
    
    @Override
    public int compare(Duck d1, Duck d2) {
        if (d1.sizeOfDuck() < d2.sizeOfDuck()) return -1;
        if (d1.sizeOfDuck() > d2.sizeOfDuck()) return 1;
        else return 0;
    }
}
