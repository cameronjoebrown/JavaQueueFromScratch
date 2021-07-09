public class QueueArray {
  private int front, back, queueSize;
  private int[] queue;

  QueueArray(int queueSize) {
    this.queueSize = queueSize;
    this.queue = new int[queueSize];
  }
}
