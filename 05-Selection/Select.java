import java.lang.Math;
import java.util.*;


public class Select { 

    public static int selectKth( int[] L, int k, int low, int high,int kill) {
	if (low == high) 
	    return L[high]; 
	
	else {
	    //Set random pivot and take the value at the pivot
	    int p = low + (int)((high-low) * Math.random());
	    p = L[p];
	    int[] D = new int[high-low+1];
	    //Filling up D
	    int left = 0;
	    int right = D.length - 1; 
	    for (int n = low; n <= high; n++) {
		if (L[n] < p) { 
		    D[left] = L[n];
		    left++;
		}
		else if (L[n] > p) {
		    D[right] = L[n];
		    right--;
		}
	    }
	    for (int n=left; n<=right; n++) 
		D[n] = p;
	    
	    for (int n = low; n <= high; n++) 
		L[n] = D[n-low];
	    
	    int pIndex = low + left; 

	    if (pIndex == k) 
		return p;
	    else if ( pIndex > k )
		return selectKth(L,k,low,pIndex-1,kill+1);
	    else 
		return selectKth(L,k,pIndex+1,high,kill+1);
	}
    }
	    
    public static void main( String[] args ) {
	int[] test = {4,32,4324,78,3};
	System.out.println(selectKth(test,4,0,4,0));
    }
}
