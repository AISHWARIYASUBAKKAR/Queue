import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author AISHWARIYA
 */
public class Dequeue {
   public final static int n=50;
   public static int q[]=new int[n];
   static int front =-1,rear=-1;
   public static void enQueue(int data){
       if(rear==n-1){
           System.out.println("Queue is Full");
           
       }
       else{
           if(front==-1)
               front=0;
           rear++;
           q[rear]=data;
       }
   }
   public static void disp(){
       if(front==-1){System.out.println("Queue is Empty");
       }
       else{
           for(int i=front;i<=rear;i++){
               System.out.print(q[i]+" ");
           }
               
       }
   }

   
   public static void main(String[]args){
       Scanner inp=new Scanner(System.in);
       int n=inp.nextInt();
      for(int i=0;i<n;i++){
          int data=inp.nextInt();
          enQueue(data);
      }
      disp();{
       deQueue();
   }
       
   }
   }
   
 