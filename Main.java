class Main {
  public static void main(String[] args) {
    // Question 05
    Queue q1 = new Queue(10);
    q1.insert(10);
    q1.insert(25);
    q1.insert(55);
    q1.insert(65);
    q1.insert(85);

    while(!q1.isEmpty()){
      System.out.println(q1.remove());
    }
  }
}  