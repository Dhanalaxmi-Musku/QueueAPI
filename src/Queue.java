
public class Queue <T>{
	 private LinkedList<T> list;
	    public Queue() {
	        list = new LinkedList<>();
	    }
	    public void enqueue(T item) {
	        list.append(item);
	    }
	    public int size() {
	        return list.size();
	    }
	    @Override
	    public String toString() {
	        return list.toString();
	    }
}
