import java.util.NoSuchElementException;
public interface QueueInterface<E>{
	public void enQueue(E item);
	public E deQueue()throws NoSuchElementException;
	public boolean isEmpty();
	public int size();
	public boolean contains(E item);
	public void print();
	public Node <E> getHead();
}