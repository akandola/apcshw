
public class Driver {
    public static void main(String[] args) {
	Node n1 = new Node("Sully");
	Node n2 = new Node("Mike");
	System.out.println(n1);
	System.out.println(n2);
	
	n1.setNext(n2);
	System.out.println(n1.getNext()); //Mike
	n1.getNext().setNext(new Node("Randall"));
	// same as n2.setNext(new Node("Randall"));
	// No direct way to access Node ("Randall")
	System.out.println();
	System.out.println(n2.getNext());
	System.out.println(n1.getNext().getNext());


	// To remove "Mike" from list
	/*
	n1.setNext(n1.getNext().getNext());
	System.out.prrtinln("Got rid of a node");
	System.out.println(n1);
	System.out.println(n1.getNext());
	System.out.println(n1.getNext().getNext());
	*/

	// Brings the loop full circle, Randall links back to Sully
	n1.getNext().getNext().setNext(n1);
	System.out.println(n1);
	System.out.println(n1.getNext());
	System.out.println(n1.getNext().getNext());
	System.out.println(n1.getNext().getNext().getNext());

	//test add(int,string)
	//n1.add(1,"Bob");
	//System.out.println(n1.getNext().getNext().getNext().getNext());

	System.out.println("Test get(int i)");
	n1.get(2);

    }
}