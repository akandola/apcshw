import java.util.*;
import java.util.Random;

public class quicksortfull {
	
    public static void swap (int[] a, int x, int y) {
	int switch = a[x];
	a[x] = a[y];
	a[y] = switch;
    }
    
    public static int partition (int[]a, int L, int R) {
	int pivot = (int)(Math.Random()*a.length);
	swap(a, high, pivot);
	int wall = L;
	for (int i=L;i<R;i++) {
	    if (a[i] < pivot) {
		swap (a, wall, i);
		wall++;
	    }
	}
	swap(a, wall, H);
    }

    public static void quicksort(int[] a) {
	return partition(a,0,a.length-1);
    }
    
    public static void main(String[] args) {
	int[] test = new int[5];
	test[0] = 4;
	test[1] = 17;
	test[2] = 3;
	test[3] = 1;
	test[4] = 7;
	System.out.println(test);
	System.out.println(quicksort(test));
    }

    

// I have absolutely no idea why it says that it reaches the endo f hte file while parsing. Everything is closed. I can't even test it because of that. So confused. Spent most of my time trying to fix the error.
