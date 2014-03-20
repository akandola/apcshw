
public class MyLinkedList {
    
    private Node head;
    
    public MyLinkedList() {
	head = null;
    }
    
    public void add(String d) {
	Node tmp = new Node(d);
	// No need to set head to ->	head.setNext(tmp_);
	//head = tmp;
	tmp.setNext(head);
	head = tmp;
    }

    public String toString() {
	String s = "";
	Node tmp = head;
	while (tmp != null) {
	    s += tmp + ", ";
	    tmp = tmp.getNext();
	}
	return s;
    }

    public void add (int i, String s) {
	int count = 0;
	Node tmp = head;
	while (tmp != null) {
	    count++;
	    if (count == (i-1)) {
		Node x = new Node(s);
		x.setNext(tmp.getNext()); //connect Node x to end loop
		tmp.setNext(x); //connect beginning loop to x, already connected to end loop
	    }
	}
    }

    public String get(int i) {
	int count = 0;
	Node tmp = head;
	while(tmp != null) {
	    count++;
	    if (count == (i-1)) {
		return tmp.getData();
	    }
	    tmp = tmp.getNext();
	}
	return "Try a different index.";
    }

    public String set(int i, String s) {
	int count = 0;
	String answer = "";
	Node tmp = head;
	    while (tmp != null) {
		if (count == i) {
		    answer = tmp.getNext().getData();
		    Node x = new Node(s);
		    x.setNext(tmp.getNext().getNext());//connect to end loop
		    tmp.setNext(x);//beginning loop -> x
		}
		tmp = tmp.getNext();
	    }
	return answer;
    }

    public String remove(int i) {
	int count = 0;
	String ans = "";
	Node tmp = head;
	while (tmp != null) {
	    count++;
	    if (count == (i-1)) {
		ans = tmp.getNext().getData(); //to return this value
		tmp.setNext(tmp.getNext().getNext()); //skip over the .getNext() or the next value, desired to remove value
	    }
	    tmp = tmp.getNext();
	}
	return ans;
    }

    public int find(String s) {
	int count = 0;
	Node tmp = head;
	    while (tmp != null) {
		count++;
		if (tmp.getData().equals(s)) { //compare the getData (string) with your string)
		    return count; //return location
		}
		tmp = tmp.getNext();
	    }
	return -1;
    }

    public int size() {
	int ans = 0;
	Node tmp = head;
	while (tmp != null) {
	    ans++;
	    tmp = tmp.getNext(); //will eventually be null
	}
	return ans;
    }	 
	      
}
