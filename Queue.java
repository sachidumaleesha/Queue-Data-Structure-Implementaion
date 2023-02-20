// Linear Queue

class Queue{
  private int[] queueArray;
  private int maxSize;
  private int front;
  private int rear;
  private int nItems;

  public Queue(int mSize){
    maxSize = mSize;
    queueArray = new int[maxSize];
    front = 0;
    rear = -1;
    nItems = 0;
  }

  public void insert(int i){
    if(rear == maxSize-1){
      System.out.println("Queue is full.");
    }
    else{
      queueArray[++rear] = i;
      nItems++;
    }
    
  }

  public int remove(){
    if(nItems == 0){
      System.out.println("Queue is empty.");
      return -99;
    }
    else{
      nItems--;
      return queueArray[front++];
    }
  }

  public int peekFront(){
    if(nItems == 0){
      System.out.println("Queue is empty.");
      return -99;
    }
    else{
      return queueArray[front];
    }
  }

  public boolean isFull(){
    return (rear == maxSize-1);
  }

  public boolean isEmpty(){
    return (nItems == 0); 
  }
}