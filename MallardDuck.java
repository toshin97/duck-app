
package edu.vassar.duck;

/**
 *
 * @author Tahsin Oshin
 */
public class MallardDuck extends Duck {
    // the sublass MallardDuck is extended from the superclass Duckapp
    
    //calling on the name and type variables from the superclass to assign
    //the specific strings
     
    public MallardDuck() {
     
     this.name = "Mallard Sr";
     this.type = "MallardDuck";
     flyBehavior = new FlyRocketPowered();
     quackBehavior = new Quack();
     
     
     assignID(this);
    }
    
    
    //to return the introduction string of ducktype
    public String toString() {
        return "I am a "+type+". My name is Mr. "+name+".";
    }
    
  
}

