import java.util.*;
import java.util.Random;

public class quicksortfull2 {
	
    public static void swap (int[] a, int x, int y) {
	int sw = a[x];
	a[x] = a[y];
	a[y] = sw;
    }
    
    public static int partition (int[]a, int k, int L, int R) {
	int x = a[k];
	// (If you use a pivot that's random) -->	int pivot = (int)(Math.random()*a.length);
	swap(a, R, k);
	int wall = L;
	for (int i=L;i<R;i++) {
	    if (a[i] < x) {
		swap (a, wall, i);
		wall++;
	    }
	}
	swap(a, R, wall);
       
	int RWALL = wall;
	for (int j = wall;j<R;j++) {
	    if (a[j] == x) {
		swap(a,j,RWALL);
		RWALL++;
	    }
	}
	
	    return ((wall + RWALL)/2);
    }

    public static int[] quicksort(int[] a, int L, int R) {
	if (a.length<=1) {
	    return a;
	}
	else if (L<R) {
	    int pivot =(int)(Math.random()*(R-L));
	    pivot = partition(a,pivot,L,R);
	    quicksort(a,L,pivot-1);
	    quicksort(a,pivot+1,R);
	    return a;
	}
	else {
	    return a;
	}
    }
    
    public static void main(String[] args) {
	int[] test = new int[5];
	test[0] = 4;
	test[1] = 17;
	test[2] = 3;
	test[3] = 1;
	test[4] = 7;
        for (int i=0;i<test.length;i++) {
	    System.out.print(test[i] + ", ");
	}
	quicksort(test,0,4);
	System.out.println(" ");
	for (int y=0;y<test.length;y++) {
	    System.out.print(test[y] + ", ");
	}
    }
}

//It almost works. It went from [4,17,3,1,7] to [4,1,3,7,17]. I don't know why the 4 didn't move though.
