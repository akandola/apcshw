import java.io.*;
import java.util.*;

public class rpn {
 private int top;
    private String[] stak;
    private int numElts;

    public rpn() {
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

    public void calc(String s) {

	//parseDouble returns a primitive double containing the value of a string
	if (s.equals("+")) {
	    double temp = Double.parseDouble(this.pop());
	    double ans = temp + Double.parseDouble(this.pop());    
	    this.push("" + ans);
	}

	else if(s.equals("*")){
	    double temp = Double.parseDouble(this.pop());
	    double ans = temp * Double.parseDouble(this.pop());
	    this.push("" + ans);
	}
	else if(s.equals("-")){
	    double temp = Double.parseDouble(this.pop());
	    double ans = temp - Double.parseDouble(this.pop());
	    this.push("" + ans);
	}
	else if (s.equals("/")){
	    double temp = Double.parseDouble(this.pop());
	    double ans = temp / Double.parseDouble(this.pop());
	    this.push("" + ans);

	}
	else if (s.equals("sin")) {
	    double temp = Double.parseDouble(this.pop());
	    double ans = Math.sin(temp);
	    this.push("" + ans);
	}
	else if (s.equals("cos")) {
	    double temp = Double.parseDouble(this.pop());
	    double ans = Math.cos(temp);
	    this.push("" + ans);
	}
	else if (s.equals("tan")) {
	    double temp = Double.parseDouble(this.pop());
	    double ans = Math.tan(temp);
	    this.push("" + ans);
	}
	else{
	    this.push(s);
	}
    }
    
    
    public static void main(String[] args){
	rpn s = new rpn();
	s.push("4");
	s.push("2");
	s.calc("sin");
	System.out.println("The sin, cos, and tan functions assume the input is in radians.");
	System.out.println(s);
    }
}
       
// Variable issues. I also can't figure out how to implement a stack here. Maybe make the start into a stack instead of a rpn?
