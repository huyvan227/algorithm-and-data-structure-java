public class Queue extends MyStack<Integer>{
	public static class MyQueue<Integer>{
		protected Node<Integer> top;
		protected int numNode;
		MyStack<Integer> stack1 = new MyStack<>();
		MyStack<Integer> stack2 = new MyStack<>();
		public void enQueue(Integer item){
			stack1.push(item);
			numNode++;
		}
		public Integer deQueue(){
			if(stack1.isEmpty() && stack2.isEmpty()){
				System.out.println("Queue is empty");
			}
			if(stack2.isEmpty()){
				while(!stack1.isEmpty()){
					stack2.push(stack1.pop());
				}
			}
			numNode--;
			return stack2.pop();
		}
		
		public Integer peek(){
			if(stack1.isEmpty() && stack2.isEmpty()){
				System.out.println("Queue is empty");
			}
			if(stack2.isEmpty()){
				while(!stack1.isEmpty()){
					stack2.push(stack1.pop());
				}
			}
			Node<Integer> tmp = stack2.getHead();
			return tmp.getData();
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
	}
	
	 public static void main(String[] args) {
		 MyQueue<Integer> queue = new MyQueue<>();
		 queue.enQueue(1);
		 queue.enQueue(2);
		 System.out.println(queue.peek());
		 queue.enQueue(3);
		 queue.deQueue();
		 System.out.println(queue.peek());
		 queue.enQueue(4);
		 queue.enQueue(5);
		 queue.deQueue();
		 System.out.println(queue.peek());
	 }
	
}

