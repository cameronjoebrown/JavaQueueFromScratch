/**
 * The QueueArray class uses Java's primitive array data type
 * to implement a Queue data structure.
 */
public class QueueArray {
  private int front, back, queueSize;
  private Object[] queue;

  QueueArray(int queueSize) {
    this.front = 0;
    this.back = 0;
    this.queueSize = queueSize;
    this.queue = new Object[queueSize];
  }

  public void add(Object item) {
    if(this.back == this.queueSize) {
      System.out.println("Queue is full. No more items can be added.");
    }
    else {
      this.queue[back] = item;
      this.back++;
    }
  }

  public void remove() {
    if(this.front == this.back) {
      System.out.println("Queue is empty. No items to remove.");
    }
    else {
      // TODO: Remove item from queue
    }
  }

  public Object peek() {
    // TODO: Implement
    return null;
  }

  public boolean isEmpty() {
    // TODO: Implement
    return true;
  }
}
