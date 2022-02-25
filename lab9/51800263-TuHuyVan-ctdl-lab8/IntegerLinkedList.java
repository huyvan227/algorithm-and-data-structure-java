public class IntegerLinkedList extends MyLinkedList<Integer>{
	public Node<Integer> addSortedList(Node<Integer> tmp, Integer item){
		if(tmp == null || item<tmp.getData()){
			return new Node<Integer>(item,tmp);
		}
		else{
			tmp.setNext((addSortedList(tmp.getNext(),item)));
			return tmp;
		}
	}
	public void setHead(Node<Integer> tmp){
		head = tmp;
	}
	public void printReverse(Node<Integer> tmp){
		if(tmp == null){
			return;
		}
		else{
			printReverse(tmp.getNext());
			System.out.print(tmp.getData()+ " ");
		}
	}
	private void swap(Node<Integer> a, Node<Integer> b){
		Integer tmp = a.getData();
		a.setData(b.getData());
		b.setData(tmp);
	}
	public void sortAscen(){
		Node<Integer> tmp = head;
		while(tmp.getNext() != null){
			Integer min = tmp.getData();
			Node<Integer> swapNode = null;
			Node<Integer> nextNode = tmp.getNext();
			while(nextNode != null){
				if(nextNode.getData()<min){
					min = nextNode.getData();
					swapNode = nextNode;
				}
				nextNode = nextNode.getNext();
			}
			if(swapNode != null){
				swap(tmp,swapNode);
			}
			tmp = tmp.getNext();
		}
	}
	public int countOdd(Node<Integer> tmp){
		if(tmp == null){
			return 0;
		}
		if(tmp.getData()%2 != 0){
			return 1 + countOdd(tmp.getNext());
		}
		else{
			return countOdd(tmp.getNext());
		}
	}
	public int countEven(Node<Integer> tmp){
		if(tmp == null){
			return 0;
		}
		if(tmp.getData()%2 == 0){
			return 1 + countEven(tmp.getNext());
		}
		else{
			return countEven(tmp.getNext());
		}
	}
	public int sum(Node<Integer> tmp){
		if(tmp == null){
			return 0;
		}
		else{
			return tmp.getData() + sum(tmp.getNext());
		}
	}
	public String findNum(Node<Integer> tmp,Integer item){
		if(tmp == null){
			return "number dont exist in list";
		}
		if(tmp.getData() == item){
			return "number exist in list";
		}
		else{
			return findNum(tmp.getNext(),item);
		}
	}
}