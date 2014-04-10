public class MyQueue {

    private Node head,tail; // can set = null
    private int size; // can set = 0
    //If commented changes above are made, no need for a constructor (variables already initialized in that case)

    public MyQueue() {
	head = null;
	tail = null;
	size = 0;
    }

    public void enqueue(String s) {
	Node n = new Node(s);
	if (tail == null) {
	    tail = n;
	    head = n;
	} else {
	    tail.setNext(n);
	    tail = n;
	}
	size++;
    }
	
    // get toString() from class code
    public String toString() {
	String s = "Head --> ";
	if (head == null) {
	    s = s + "Cest nes pa une string -->";
	}
	Node tmp = head;
	while (tmp != null) {
	    s = s + tmp.getData()
		// FINISH THIS
		}
    }
    
    public String front() {
	if (head == null) {
	    return null;
	}
	return head.getData;
    }
    
    public boolean isEmpty() {
	return head == null;
    }
    public String dequeue() {
	String s;
	if(head==null) {
	    s = null;
	} else {
	s = head.getData();
	head = head.getNext();
	size--;
	if (head == null) {
	    tail = null;
	}
	}
	// FIX THIS
	return s;
    }
}