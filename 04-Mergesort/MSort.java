import java.util.ArrayList;

public class MSort{
    
    private ArrayList<Integer> master, test1, test2 = new ArrayList<Integer>(); 

    test1.add(0);
    test1.add(3);
    test1.add(10);
    test1.add(7);
    test1.add(11);
    test2.add(9);
    test2.add(20);
    test2.add(4);
    test2.add(9);
    test2.add(9);
    test2.add(9);
    test2.add(9);
    test2.add(9);

    public ArrayList<Integer> merge (ArrayList<Integer> A, ArrayList<Integer> B){
	while (A.size() >= 0 || B.size() >= 0){
	    if(A.get(0) < B.get(0)){
		master.add(A.get(0));
		A.remove(0);
	    }
	    
	    if(B.get(0) < A.get(0)){
		master.add(B.get(0));
		B.remove(0);
	    }
	 
	    if(A.get(0) == B.get(0)){
		master.add(A.get(0));
		master.add(B.get(0));
		A.remove(0);
		B.remove(0);
	    }
	    
	    if(A.size() == 0 && B.size() > 0){
		for(int i = 0; i<B.size(); i++){
		    master.add(B.get(i));
		}
	    }
	    
	    if(B.size() == 0 && A.size() > 0){
		for(int i = 0; i<A.size(); i++){
		    master.add(A.get(i));
		}
	    }
	    
		
	    
	    
	}
	
	return master;
    }


    public String toString(){
	String ans = "{";
	for (int i =0; i< master.size(); i++){
	    ans += master.get(i) + ", ";
	}
	ans += "}";
	return ans;
    }



    public static void main(String[] args){
	MSort m = new MSort();
	
	
    }




}
