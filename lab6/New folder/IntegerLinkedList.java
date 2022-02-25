import java.util.NoSuchElementException;
public class IntegerLinkedList extends MyLinkedlist<Integer> {

	public int  countEven(){
		int count = 0;
		Node<Integer> tmp = head;
		while(tmp != null){
			if(tmp.getData()%2 == 0){
				count++;
			}
			tmp = tmp.getNext();
		}
		return count;
	}
	public int  countOdd(){
		int count = 0;
		Node<Integer>tmp = head;
		while(tmp != null){
			if(tmp.getData()%2 != 0){
				count++;
			}
			tmp = tmp.getNext();
		}
		return count;
	
	}
	public int  countPrime(){
		int count = 0;
		Node<Integer> tmp = head;
		
		while(tmp != null){
			int a = 1;
			if(tmp.getData()==0 || tmp.getData()== 1 ){
				a = 0;
				break;
			}
			else if(tmp.getData() == 2){
				count++;
			}
			else{
				int m = size();
				for(int i = 2; i<=m ;i++){
					if(tmp.getData()%i ==0){
						a = 0;
						break;	
					}
				}
				if( a == 1){
					count++;
				}
			}
			tmp = tmp.getNext();
		}
		return count;
	}
	public void addFirstEven(int data){
		Node curr = null;
		Node tmp = head;
		Node pretmp = null;
		while(tmp != null){
			if(tmp.getData()%2 == 0){
				if (tmp == head){
					addFirst(data);
					break;
				}
				else{
					addAfter(pretmp,data);
					break;
				}
			}
		pretmp = tmp;
		tmp = tmp.getNext();
		}
	}
	public int maximum(){
		Node tmp = head;
		Node max = head;
		while(tmp != null){
			if(tmp.getData() > max.getData()){
				max = tmp;
			}
		tmp = tmp.getNext();
		}
		return max.getData();
	}
	public int minimum(){
		Node tmp = head;
		Node min = head;
		while(tmp != null){
			if(tmp.getData() < min.getData()){
				min = tmp;
			}
		tmp = tmp.getNext();
		}
		return min.getData();
	}
	public void reverse(){
		Node pre = null;
		Node curr = head;
		Node next = null;
		while(curr != null){
			next = curr.getNext();
			curr.setNext(pre);
			pre = curr;
			curr = next;
		}
		head = pre;
	}
	public void sortAscen(){
		for(Node  curr = head; curr.getNext() != null; curr = curr.getNext()){
			for(Node aftercurr = curr.getNext(); aftercurr != null; aftercurr = aftercurr.getNext()){
				if(curr.getData() > aftercurr.getData()){
					int tmp = curr.getData();
					curr.setData(aftercurr.getData());
					aftercurr.setData(tmp);					
				}
			}
		}
		
	}
	public void sortDescen(){
		for(Node curr = head; curr.getNext() != null; curr = curr.getNext()){
			for(Node aftercurr = curr.getNext(); aftercurr != null; aftercurr = aftercurr.getNext()){
				if(curr.getData() < aftercurr.getData()){
					int tmp = curr.getData();
					curr.setData(aftercurr.getData());
					aftercurr.setData(tmp);					
				}
			}
		}
		
	}
    
}