import java.util.NoSuchElementException;
public class MyQueue<E> implements QueueInterface<E>{
	protected Node <E> front;
	protected Node <E> rear;
	protected int numNode;
	
	public void enQueue(E item){
		if(front == null){
			front = new Node<E>(item,null);
			numNode++;
			rear = front;
		}
		else{
			Node<E> tmp = new Node<E>(item,null);
			rear.setNext(tmp);
			rear = tmp;
			numNode++;
		}
	}
	
	public E deQueue()throws NoSuchElementException{
		if(front == null){
			throw new NoSuchElementException();
		}
		else{
			Node<E> tmp = front;
			front = front.getNext();
			numNode--;
			return tmp.getData();
		}
	}
	
	public boolean isEmpty(){
        if(numNode == 0){
			return true;
		}
        return false;
    }
	
	public int size(){
        return numNode;
    }
	
	public boolean contains(E item){
        Node<E> tmp = front;
        while(tmp != null)
        {
            if(tmp.getData().equals(item))
            return true;
            tmp = tmp.getNext();
        }
        return false;
    }
	
	public void print(){
        if(front != null)
        {
            Node<E> tmp = front;
            System.out.print("List: " + tmp.getData());
            tmp = tmp.getNext();
            while(tmp != null)
            {
                System.out.print(" -> " + tmp.getData());
                tmp = tmp.getNext();
            }
            System.out.println();
        }
        else
        {
            System.out.println("List is empty!");
        }
    }
	
	public Node <E> getHead(){
		return front;
	}
}
	
