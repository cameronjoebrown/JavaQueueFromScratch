/**
 * The QueueArray class uses Java's primitive array data type
 * to implement a Queue data structure.
 *
 * @author Cameron Brown
 */
public class QueueArray {
  /** The index of the item at the front of the queue */
  private int front;

  /** The index of the item at the back of the queue */
  private int back;

  /** The max amount of items that can fit in the queue since the size of
   *  Java's primitive array cannot be changed after initialization */
  private final int capacity;

  /** The amount of items that are currently in the queue */
  private int queueSize;

  /** The actual queue stored using Java's primitive array type */
  private Object[] queue;

  QueueArray(int capacity) {
    this.front = 0;
    this.back = 0;
    this.capacity=capacity;
    this.queue = new Object[capacity];
  }

  public void add(Object item) {
    if(this.back == this.capacity) {
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
    return queue[front];
  }

  public boolean isEmpty() {
    // TODO: Implement
    return true;
  }
}
