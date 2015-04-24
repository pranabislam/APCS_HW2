public class Tree{
    private Node t1; //dummy 1 
    private Node t2; // dummy 2


    public void Insert(Node n){
	
	
    }

    public Node Search(Node t, Integer i){
	while (t =! null){
	    int c = t.getData.compareTo(i);
	    if (c > 0){
		t = t.getRight();
	    }
	    if (c < 0){
		t = t.getLeft();
	    }
	    else return t;
	}
	return null;
    }
	
	
}



