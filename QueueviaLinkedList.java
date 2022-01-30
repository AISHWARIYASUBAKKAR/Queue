public class QueueviaLinkedList {
  private Node front, rear; 
 private int s; // number of items
 
 //class to define linked node
 private class Node
 { 
 int data;
 Node next;
 }
 
 
 public QueueviaLinkedList()
 {
 front = null;
 rear = null;
 s = 0;
 }
 
 public boolean isEmpty()
 {
 return (s == 0);
 }
 
 //to Remove item 
 public int dequeue()
 {
 int data = front.data;
 front = front.next;
 if (isEmpty()) 
 {
 rear = null;
 }
 s--;
 System.out.println(data+ "removed from the queue");
 return data;
 }
 
 //to Add data .
 public void enqueue(int data)
 {
 Node old = rear;
 rear = new Node();
 rear.data = data;
 rear.next = null;
 if (isEmpty()) 
 {
 front = rear;
 }
 else 
 {
 old.next = rear;
 }
 s++;
 System.out.println(data+ "added to the queue");
 }
 public static void main(String args[]){
 
 QueueviaLinkedList queue = new QueueviaLinkedList();
 queue.enqueue(1);
 queue.dequeue();
 queue.enqueue(2);
 queue.enqueue(3);
 queue.enqueue(4);
 queue.dequeue();
 queue.enqueue(5);
 queue.dequeue();
 queue.enqueue(6);
 queue.enqueue(7);
 queue.dequeue();
 queue.enqueue(8);
 queue.enqueue(9);
 }
} 
