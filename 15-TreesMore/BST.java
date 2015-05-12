import java.io.*;
import java.util.*;
public class BST{
    Node r;

    public Node search(Node t, int i){
	if (t==null || t.getData()==i){
	    return t;
	}
	else if (i<t.getData()){
	    return search(t.getLeft(),i);
	} else {
	    return search(t.getRight(),i);
	}
    }

    public String search(int i){
	Node n = search(r,i);
	if (n==null){
	    return "NOT FOUND";
	}else{
	    return n.toString();
	}
    }

    public void insert(int i){
	Node n = new Node(i);
	Node t2=null;
	Node t = r;
	if (r==null){
	    r=n;
	    return;
	}
								
	while (t!=null){
	    t2 = t;
	    if (t.getData()==i)
		return;
	    else if (t.getData() < i)
		t=t.getRight();
	    else if (t.getData() > i)
		t=t.getLeft();
	    else
		return;
	}

				
	if (i>t2.getData())
	    t2.setRight(n);
	else
	    t2.setLeft(n);
    }

    public String Traverse(Node t){
	String s;
	if (t == null){
	    return "";
	}
	
	else {
	    s = s + Traverse(t.getLeft());
	    s = s + t;
	    s = s + Traverse(t.getRight());
	}
    }


    public int Remove(int x){
	Node t = null;
	Node t2 = null;
	
	
	
	
    }

    public int nodeCount(Node n){
	if (n == null){
	    return 0;
	}
	
	else {
	    return 1 + nodeCount(n.getLeft()) + nodeCount(n.getRight());
	}
    }

    public int sumTree(Node n){
	if (n == null){
	    return 0;
	}
	
	else {
	    return 1 + sumTree(n.getLeft()) + sumTree(n.getRight());
	}
    }

    public int max(Node n){
	int cmax = n.getData(); //wrong
	if (cmax < n.getData()){
	    cmax = n.getData();
	} 
	else {
	    max(n.getLeft());
	    max(n.getRight());
	}
    }
	
    

 public int height(Node n) {
        if (n == null) {
            return 0;
        } else {
            return 1 + Math.max(height(t.getLeft()), height(t.getRight()));
        }
    }

    /*
      longest path 
      Diam(Node t){
       if(t == null){
       return 0;
}
else {

int PL1;
PL1  = height(t.getleft()) + height(t.getright()) + 2;
PL2 = Diam(t.getleft());
PL3 = Diam(t.getright());
return max(PL1, PL2, PL3);
}}
      
      
      
      
      
      
     */ 
 

    public static void main(String[] args){
	BST t = new BST();
	Random r = new Random();
	for (int i = 0; i < 20; i ++){
	    int z = r.nextInt(100);
	    //System.out.println(z);
	    t.insert(z);
	}
	t.insert(30);
	System.out.println(t);
	System.out.println(t.search(30));
    }
}






								


		
