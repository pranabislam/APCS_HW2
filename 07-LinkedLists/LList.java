public class LList {
		private Node l=null;

		public void add(String s){
				Node tmp = new Node(s);
				tmp.setNext(l);
				l = tmp;
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



    public void insert( int i, String s ) {
	Node tmp = new Node(s);
	Node front = l;
	Node back = l;
	for ( int n = 0; n < i; n++ ) {
	    back = front;
	    front = front.getNext();
	}
	tmp.setNext(front);
	back.setNext(tmp);
    }


    public String find(int n){
	int i = 0;
	Node tmp = l;
	while(i<n && tmp != null){
	    tmp = tmp.getNext();
	    i++;
	}
      
	return tmp.getData();
    }


	
}
