public class IntegerLinkedList <Integer> extends MyLinkedList <Integer> {  
	protected Node <Integer> head;
	protected int numNode;
	public IntegerLinkedList(){
		head = null;
		numNode = 0;
	}
	public int countEven(){
		int count = 0;
		Node<Integer> tmp = new Node();
		while(tmp!= null){
			if(tmp.getData()%2 == 0)
				count++;
		}
		return count;
	}
}