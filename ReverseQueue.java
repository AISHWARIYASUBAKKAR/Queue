public class ReverseQueue {
    static Queue<Integer> que; 

    
    static void show() 
    { 
        while (!que.isEmpty()) { 
            System.out.println( que.peek() ); 
            que.remove(); 
        } 
    } 

    // Function to reverse the que 
    static void queuereverse() 
    { 
        Stack<Integer> stk = new Stack<>(); 
        while (!que.isEmpty()) { 
            stk.add(que.peek()); 
            que.remove(); 
        } 
        while (!stk.isEmpty()) { 
            que.add(stk.peek()); 
            stk.pop(); 
        } 
    } 

    // Driver code 
    public static void main(String args[]) 
    { 
        que = new LinkedList<Integer>(); 
        
        que.add(5); 
        que.add(20); 
        que.add(60); 
        que.add(40); 
        queuereverse(); 
        show(); 
    } 