import java.io.*;
import java.util.*;

public class rpn {
    rpn a = new rpn();
    public void calc(String s) {

	//parseDouble returns a primitive double containing the value of a string
	if (s.equals("+")) {
	    double temp = Double.parseDouble(s.pop());
	    double ans = temp + Double.parseDouble(s.pop());    
	    s.push("" + ans);
	}

	else if(s.equals("*")){
	    double temp = Double.parseDouble(s.pop());
	    double ans = temp * Double.parseDouble(s.pop());
	    this.push("" + ans);
	}
	else if(s.equals("-")){
	    double temp = Double.parseDouble(s.pop());
	    double ans = temp - Double.parseDouble(s.pop());
	    s.push("" + ans);
	}
	else if (s.equals("/")){
	    double temp = Double.parseDouble(s.pop());
	    double ans = temp / Double.parseDouble(s.pop());
	    s.push("" + ans);

	}
	else{
	    s.push(s);
	}
    }
    
    
    public static void main(String[] args){
	rpn s = new rpn();
	s.push("4");
	s.push("2");
	s.calc("-");
	System.out.println(s);
    }
}
       
// Variable issues. I also can't figure out how to implement a stack here. Maybe make the start into a stack instead of a rpn?
