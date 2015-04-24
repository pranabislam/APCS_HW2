public class Tree{
    private Node t1; //dummy 1 
    private Node t2; // dummy 2


    

    public void Insert(Node n){	
	while (t1 =! null){
	    
	    int c = t1.getData().compareTo(n.getData());
	    if (c > 0){
		t2 = t1;
		t1 = t1.getRight();
		
	    }
	    if (c < 0){
		t2 = t1;
		t1 = t1.getLeft();
		}
	}
	if (t2.getData().compareTo(n.getData()) > 0){
	    t2.setLeft(new Node(i));
	}
        else t2.setRight(new Node(i));
	
	
    }

    public Node Search(Node t, Integer i){
	while (t =! null){
	    int c = t.getData().compareTo(i);
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



