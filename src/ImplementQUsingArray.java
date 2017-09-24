import java.util.NoSuchElementException;

public class ImplementQUsingArray {
	
	int[] arr;
	int front;
	int rear;
	int size;
	
	ImplementQUsingArray(int size) {
		
		this.size = size;
		arr = new int[size];
		rear = -1;
		front = -1;
		
	}
	
	void enqueue(int val) {
		
		if(isFull()) 
			throw new ArrayIndexOutOfBoundsException("Queue is full");
		
		else if(front == -1 && rear == -1)
			front = 0;
		
		
		arr[(++rear)%size] = val;
		
	}
	
	int dequeue() {
		
		if(isEmpty())
			throw new NoSuchElementException("Queue is Empty");
		
		int ele = arr[front];
		front = (front+1) % size;
		return ele;
	}
	
	boolean isFull() {
		
		return (!isEmpty() && (rear == front) && rear == size);
	}
	
	boolean isEmpty() {
		
		return (rear == -1 && front == -1);
	}
	
	int peek() {
		
		if(isEmpty())
			throw new NoSuchElementException("Queue is empty");
		
		return arr[front];
	}
	
	void print() {
		
		for(int i = front; i <= rear;i++)
			System.out.print(arr[i%size] + "\t");
		
		System.out.println();
	}
	public static void main(String[] args) {
		
		ImplementQUsingArray q = new ImplementQUsingArray(3);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		
		System.out.println("After 3 enqueues");
		q.print();
		
		System.out.println("After dequeue of " +q.dequeue());
		q.print();
		
		q.enqueue(4);
		System.out.println("After one more enqueue");
		q.print();
		
		
	}
	
}