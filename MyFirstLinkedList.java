import java.util.*;

class MyFirstLinkedList{
	public static void main(String args[]){

		//initialing a linked list class object 
		LinkedList<String> ll = new LinkedList<String>();

		//adding the first element
		ll.add("First");
		ll.add("second");

		//My first iterator through java object types
		Iterator<String> itr = ll.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}


	}
}
