package tutorial10;

public class Application {
	public static void main(String [] args) {
		
		Entrance entrance = new Entrance (100);
		
		entrance.addVisitor(new Groups(6)); 
		entrance.addVisitor(new Groups(3));
		entrance.addVisitor(new Adult()); 
		entrance.addVisitor(new Children()); 
		entrance.addVisitor(new Children());   
		
		System.out.println("Visitors: " + entrance.computeVisitor()); 
		System.out.println("Revenue: " + entrance.computeIncome() + " Euro"); 
	}

}
