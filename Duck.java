
package edu.vassar.duck;
import java.util.Random;
import java.util.ArrayList;
import java.util.*;



/**
 *
 * @author Tahsin Oshin
 */


public class Duck  {

   
    // variables defining the duck name, type and method of flying is declared
     
//    public String generateID() {
//        GenerateUUID genId = new GenerateUUID();
//        String duckID = genId.makeUniqueID();
//      
//        return duckID;
//    }
    
    
    String name = "duck";
    String type = "ducktype";
    
     
     
    public String getName() {return this.name;}
    
    
    
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    
    //method defining if the duck can swim
    public String swim() {
        String sm = "I am Mr. "+name+" of the "+type+" class of "
                + "ducks and I am swimming.";
        System.out.println(sm);
        return sm;
    }
    
    //method defining if the duck can quack
    public String performQuack() {
        
       String quack = quackBehavior.quack();
       return quack; 

    }
    
    //method defining if the duck can fly
    public String performFly() {
        String fly = flyBehavior.fly();
        return fly;
    }
    
    public int sizeOfDuck() {
        ArrayList<Integer> listy  = new ArrayList<Integer>();
        listy.add(1);
        listy.add(2);
        listy.add(5);
        listy.add(10);
        
        Random rand = new Random();
        int length = listy.get(rand.nextInt(listy.size()));
        
        
        String len = Integer.toString(length);
        System.out.println(len);
        
        return length;
        
    }
    
    
    static Map<String,Duck> flockchart;
    static String serial;
    
    
    
    public void assignID (Duck duckObj) {
        makeUniqueID();
        flockchart.put(serial,duckObj); 
    }
    
    
    
     public void makeUniqueID() {
        
        UUID makeID = UUID.randomUUID();
        String strID = makeID.toString();
        String ID = strID.substring(0,5);
        
        if(flockchart.containsKey(ID)) {
         makeUniqueID();
     }
        else serial = ID;
     
    }
    
    static Collection<Duck> duckCollection = flockchart.values();
    static Object[] duckArray = duckCollection.toArray();
    static List duckList = Arrays.asList(duckArray);
    
    //main method calls and test the different bird attributes
    
    public static void main(String[] args) {
        
        //objects of the various duck type classes are created to call on the 
        //methods
        
    MallardDuck mall = new MallardDuck();
    RedheadDuck redhd = new RedheadDuck();
    RubberDuck rubbr = new RubberDuck();
    DecoyDuck decoy = new DecoyDuck();
    ModelDuck model = new ModelDuck();
        
    flockchart = Collections.synchronizedMap(new HashMap<String, Duck>());
    
    SortByName sortByName = new SortByName();
    SortByLength sortByLength = new SortByLength();
    
    Collections.sort(duckList, sortByName);
    Collections.sort(duckList, sortByLength);
    
    for(Object duck : duckList) 
        System.out.println(duck + serial);
    
    
    //calling methods on the duck types
    System.out.println(mall);
    mall.swim();
    mall.performQuack(); 
    mall.performFly();
    mall.sizeOfDuck();
    
    
    System.out.println();
    
    System.out.println(redhd);
    redhd.swim();
    redhd.performQuack();
    redhd.performFly(); 
    redhd.sizeOfDuck();
    
    System.out.println();
    
    System.out.println(rubbr);
    rubbr.swim();
    rubbr.performQuack();
    rubbr.performFly();
    rubbr.sizeOfDuck();
    
            
    System.out.println();
    
    System.out.println(decoy);
    decoy.swim();
    decoy.performQuack();
    decoy.performFly();
    decoy.sizeOfDuck();
    
   
    System.out.println();
    
    //the flytype is specified in a new method setFly implemented
    //in ModelDuck class
    System.out.println(model);
    model.swim();
    model.performQuack();
    model.performFly();
    model.sizeOfDuck();
    
    
    
    
    
    }
    
    
    
}
    

