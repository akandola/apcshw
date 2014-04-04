
public class MyStack {
    private Node top; 
    //constructor 1
    public MyStack() {
	top = null;
	numElts = 0;
    }

    // push 2
    public void push(String s) {
	Node n = new Node(s);
	n.setNext(top);
	top = n;
	numElts = numElts + 1;
    }
    // pop
    public String pop() {
	String ret = top.getData();
	top = top.getNext();
	return ret;
	numElts = numElts - 1;
    }
    //size
    public int size() {
	return numElts;
    }
	
    // peek
    public String peek() {
	return top.getData();
    }

    //isEmpty
    public boolean isEmpty() {
	return top==null;
	/*
	if (top==null) {
	    return true;
	}
	else {
	    return false;
	}
	*/
    }
    //toString 3
    public String toString() {
	String s = "";
	Node tmp = top;
	while(tmp != null) {
	    s = s + tmp.getData() + ", ";
	    tmp = tmp.getNext();
	}
	return s.substring(0,s.length()-2);
    }
    // with a for loop
    // for (Node tmp - top; tmp!= null; tmp = tmp.getNext()) {
    //s = s +tmp.getData() + ", ";
    //} 
}