import java.util.PriorityQueue;
import java.util.*;

//Anmolpreet Kandola and Matthew Binshtok
//HW19 - Builtins

public class Median{

    PriorityQueue minheap = new PriorityQueue();
    PriorityQueue maxheap = new PriorityQueue();
    
    public void add(double x){
	if ( minheap.size() <= maxheap.size() ){
	    minheap.add(x);
	}
	else{
	    maxheap.add(x);
	}
    }

    public int findMedian(){
	if ( minheap.size() < maxheap.size() ){
	    return maxheap.peek();
	}
	else if ( maxheap.size() < minheap.size() ){
	    return minheap.peek();
	}
	else {
	    return (( maxheap.peek() + minheap.peek() ) / 2 );
	}
    }

    public void removeMedian(){
	if ( minheap.size() > maxheap.size() ){
	    maxheap.poll();
	}
	else if ( minheap.size() > maxheap.size() ){
	    minheap.poll();
	}
	else {
	    maxheap.poll();
	    minheap.poll();
	}
    }
   

    public static void main (String[]main){

	PriorityQueue x = new PriorityQueue();
	PriorityQueue y = new PriorityQueue();

    }
}
