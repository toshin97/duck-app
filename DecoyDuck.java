
package edu.vassar.duck;

/**
 *
 * @author Tahsin Oshin
 */
public class DecoyDuck extends Duck {
    // the sublass DecoyDuck is extended from the superclass Duckapp
    
    //calling on the name and type variables from the superclass to assign
    //the specific strings
    
    public DecoyDuck() {
        this.name = "Decoy";
        this.type = "DecoyDuck";
        flyBehavior = new NoFly();
        quackBehavior = new Mute();
    }
    
    
     //to return the introduction string of ducktype
    public String toString() {
        return "I am a "+type+". My name is Mr. "+name+".";
    }
    
   
}

