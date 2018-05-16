
package edu.vassar.duck;

/**
 *
 * @author Tahsin Oshin
 */
public class RubberDuck extends Duck {
    // the sublass RubberDuck is extended from the superclass Duckapp
    
    //calling on the name and type variables from the superclass to assign
    //the specific strings
   
    public RubberDuck() {
        this.name = "Rubber";
        this.type = "RubberDuck";
        flyBehavior = new NoFly();
        quackBehavior = new Squeak();
    }
    
    //to return the introduction string of ducktype
    public String toString() {
        return "I am a "+type+". My name is Mr. "+name+".";
    }
    
   
}

