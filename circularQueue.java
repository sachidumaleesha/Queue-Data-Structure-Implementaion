// Circular Queue

class circularQueue{
  private int[] queueArray;
  private int maxSize;
  private int front;
  private int rear;
  private int nItems;

  public circularQueue(int mSize){
    maxSize = mSize;
    queueArray = new int[maxSize];
    front = 0;
    rear = -1;
    nItems = 0;
  }

  public void insert(int i){
    if(nItems == maxSize){
      System.out.println("Queue is full.");
    }
    else{
      if(rear == maxSize-1){
        rear = -1;
      }
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
      int temp = queueArray[front++];

      if(front == maxSize){
        front = 0;
      }

      return temp;
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
    return (nItems == maxSize);
  }

  public boolean isEmpty(){
    return (nItems == 0); 
  }
}