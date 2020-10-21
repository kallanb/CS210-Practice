package practicing;

public class ByTheSea {
	  public static void main(String[] args) {
	    SeaCreature[] elements = {new Squid(), new Whale(), new SeaCreature(), 
	                            new Mammal()};
	    for (int i = 0; i < elements.length; i++) {
	      System.out.println(elements[i]);
	      elements[i].method1();
	      elements[i].method2();
	      System.out.println();
	    }
	  }
	}