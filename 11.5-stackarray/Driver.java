public class Driver {
    public static void main(String[] args) { 
	MyStack a = new MyStack();
	a.push("one");
	a.push("two");
	a.push("three");
	System.out.println(a);
	while(!a.isEmpty()) {
	    System.out,
	System.out.println(a.pop());
	System.out.println(a.pop());
	System.out.println(a.pop());
    }
}