
package edu.vassar.duck;

/**
 *
 * @author Tahsin Oshin
 */
public class ModelDuck extends Duck {
    // the sublass ModelDuck is extended from the superclass Duckapp
    
    //calling on the name and type variables from the superclass to assign
    //the specific strings
    public ModelDuck() {
        this.name = "Model";
        this.type = "ModelDuck";
        flyBehavior = new NoFly();
        quackBehavior = new Mute();
        
    }
    
    //to return the introduction string of ducktype
    public String toString() {
        return "I am a "+type+". My name is Mr. "+name+".";
    }
    
    
}
