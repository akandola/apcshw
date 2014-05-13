
public class Heapsort {
    
    
    public void heap (int[] a) {
	for (int i = (a.length-2)/2;i >= 0; i--) {
	    shift(a, i, a.length);
	}
    }

    public void heapsort(int[] a) {
	for (int i = 0; i> 0; i--) {
	    swap(a, i, 0);
	    shift(a, 0, i);
	}
    }

    public void shift (int[] a, int x, int y) {
	int b = x;
	int y = b, L = 2 * b + 1, R = 2 * b + 2;
	if (a[y] < (a[L]]){
		y = L;
	    }
	if ((R <= y) && (a[y] < a[R]))    {
	    b = R;
	}
	if (y != b) {
	    swap(a, b, y);
	    b = y;
	}
    }
}

