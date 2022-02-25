import java.util.NoSuchElementException;
public interface StackInterface<E>{
	public void push(E item);
	public E pop() throws NoSuchElementException;
	public boolean isEmpty();
	public int size();
	public boolean contains(E item);
	public void print();
	public Node <E> getHead();
}
