/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.vassar.duck;

import java.util.*;


/**
 *
 * @author Tahsin Oshin
 */
public class SortByName implements Comparator<Duck> {
 
   @Override
  public int compare(Duck d1, Duck d2) {
      return d1.getName().compareTo(d2.getName());
  }
    
    
}
