
package edu.vassar.duck;

/**
 *
 * @author Tahsin Oshin
 */
public class RedheadDuck extends Duck {
// the sublass RedheadDuck is extended from the superclass Duckapp
    
    //calling on the name and type variables from the superclass to assign
    //the specific strings
    
    public RedheadDuck() {
        this.name = "Redhead Jr";
        this.type = "RedheadDuck";
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    
   //to return the introduction string of ducktype
    public String toString() {
        return "I am a "+type+". My name is Mr. "+name+".";
    }
    
}