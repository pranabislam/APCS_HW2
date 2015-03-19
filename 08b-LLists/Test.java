import java.io*;
import java.util*;
import java.lang.System;

public class test{
    private int n = 200;
    private ArrayList<Integer> lala = new ArrayList<Integer>(n);
    private LinkedList<Integer> l0l0 = new LinkedList<Integer>(n);
    Random r = new Random();
    
    public test(){
	for (int i = 0; i < n; i++){
	    lala.add(r.nextInt(11));
	    l0l0.addFirst(r.nextInt(11));

	}

	public int sumArr(){
	    int sum = 0;
	    for (int i = 0; i < lala.length; i++){
		sum += ArrayList.get(i);
	    }
	}
    
    	public int sumLL(){
	    int sum = 0;
	    for (int i = 0; i < l0l0.length; i++){
		sum += l0l0.get(i);
	    }
	}
    
    
    
    
    
    
    
    
    
    
    
}



    
