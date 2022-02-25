import java.util.NoSuchElementException;
public interface ListInterface {
    public void addFirst(int item);
    public void addAfter(Node  curr, int item);
    public void addLast(int item);
    public int removeFirst() throws NoSuchElementException;
    public int removeAfter(Node  curr) throws NoSuchElementException;
    public int removeLast() throws NoSuchElementException;
    public void print();
    public boolean isEmpty();
    public int getFirst() throws NoSuchElementException;
    public Node getHead();
    public Node getFirstItem(int item);
    public int size();
    public boolean contains(int item);
    public int removeCurr(Node curr);
}