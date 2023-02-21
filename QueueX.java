public class QueueX { 

	private int maxSize; 
	private int rear; 
	private int front; 
	private int noItems; 
	private int queueArr[]; 

	QueueX(int s){ 
		maxSize = s; 
		queueArr = new int[maxSize]; 

		front = 0; 
		rear = -1; 
		noItems = 0; 
	} 

	public void insert(int j) { 
		if(rear == maxSize - 1) { 
			System.out.println("Queue Class is Full!");  
		} 
		else { 
			queueArr[++rear] = j; 
			noItems++; 
		}
	} 

	public int remove() { 
		if(noItems == 0) { 
			System.out.println("Queue is Empty!"); 
			return -99; 
		}
		else { 
			noItems--; 
			return queueArr[front++]; 
		}
	} 

	public boolean isEmpty() { 
		return (noItems == 0); 
	} 

	public boolean isFull() { 
		return (rear == maxSize-1); 
	} 
} 