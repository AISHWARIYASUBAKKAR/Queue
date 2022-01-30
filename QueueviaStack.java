public class QueueviaoneStack {
    static class Queue
  {
        static Stack<Integer> stack1=new Stack<Integer>();
        static Stack<Integer> stack2=new Stack<Integer>();
        static void enQueue(int value){
               //move all elements from stack1 to stack2
               while(!stack1.isEmpty())
               {
                       stack2.push(stack1.pop());
                }
              //push value into stack1
              stack1.push(value);
             
               //push everything back to stack1
                  while(!stack2.isEmpty())
                  {
                       stack1.push(stack2.pop());
                   }               
         }
         static int deQueue()
        {
              if(stack1.isEmpty())
              {
                  System.out.println("Queue is empty");
                  System.exit(0);
                }
 
              //Return top of stack1
              int value=stack1.pop();
              return value;
         }
   };
  public static void main(String[] args)
  {
          Queue q=new Queue();
           q.enQueue(10);
           q.enQueue(20);
           q.enQueue(30);
           System.out.println(q.deQueue());        
           System.out.println(q.deQueue());        
           System.out.println(q.deQueue());        

  }
}
