public class myStack<E>{
    private Node l = null; // You decide how the node(s) are declared
    private Node o = new Node("asas");
    // make whatever constructor(s) you need
    public myStack(){
        Node tmp1 = new Node("haha");
	Node tmp2 = new Node("gege");
	Node tmp3 = new Node("swaswa");
	Node tmp4 = new Node("lala");
	Node tmp5 = new Node("uhuh");
	Node tmp6 = new Node("ahah");
	Node tmp7 = new Node("lol ");
	l.setNext(tmp1);
	tmp1.setNext(tmp2);
	tmp2.setNext(tmp3);
	tmp3.setNext(tmp4);
	tmp4.setNext(tmp5);
	tmp5.setNext(tmp6);
	tmp6.setNext(tmp7);
    }

    
    public String toString(){
	String s = "";
	Node tmp;
	for (tmp = l; tmp != null; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }


    public void push(E data){
        // add something to the top
    }

    public E pop(){
        // remove and return the top item from the stack
	return o.getData();
    }

    public boolean empty(){
	return false;
    }

    public E top() {
        // return the top item from the stack
	//myStack s = new myStack();
	
	return o.getData();
    }
}
