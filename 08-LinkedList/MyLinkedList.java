
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
	//	s = ""+head; + head.getNext() + head.getNext().getNext();
	//	while() {
	//	}
	return s;
    }
}