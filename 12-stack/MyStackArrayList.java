
public class MyStackArrayList {
    private int top;
    private String[] stak;
    private int numElts;

    public MyStackArrayList() {
	stak = new String[10];
	top = -1;
	numElts = 0;
    }

    private void grow() {
	String[] ans = new String[stak.length * 2];
	for (int i=0;i<stak.length;i++) {
	    ans[i] = stak[i];
	}
	    stak = ans;
    }

    public void push(String s) {
	top++;
	while(top>=stak.length) {
	    grow();
	}
	stak[top] = s;
	numElts++;
    }

    public String pop() {
	String temp = new String(stak[top]);
	top = top-1;
	numElts--;
	return temp;
    }

    public String peek() {
	return stak[top];
    }
    
    public int size() {
	return numElts;
    }

    public String toString() {
	String ans = new String();
	for (int i=top;i>=0;i--) {
	    ans = ans + String.format("%s\n",stak[i]);
	}
	return ans;
    }
}
       
