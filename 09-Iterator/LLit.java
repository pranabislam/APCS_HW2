import java.io.*;
import java.util.*;

public class LLit<E> implements Iterator<E>{
    private Node<E> t;
    private Node<E> head;

    public LLit(Node<E> n){
	t=n;
	head = n;
    }

    public boolean hasNext(){
	return t!=null;
    }

    public E next(){
	E retval = t.getData();
	t=t.getNext();
	return retval;
    }

    public void remove() {
	Node tmp= head;
	while(tmp.getNext().getNext()!=null){
	    if(tmp.getNext().getNext() == t){
		tmp.setNext(t);
	    }
	    tmp = tmp.getNext();
	}
    }
}
