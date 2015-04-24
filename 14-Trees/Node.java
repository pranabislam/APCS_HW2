public class Node{
    private Node left, right;
    private int data;
    
    
    public Node(int i){
   	 this.data = i;
   	 this.right = null;
   	 this.left = null;
   	 
   	 }
   	 
    public int getData(){
   	 return this.data();    
    }
    
    
    public void setData(int i){
   	 this.data = i;
    }
    
    }
