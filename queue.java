//Implement queue using interface.

import java.util.*;

interface Queue
{
    void enqueue(int i);
    void dequeue();
}
class queue{
    int[] arr;
    int front;
    int rear;
    int size;
      public void SimpleQueue(int size)
    {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }
     public void enqueue(int i)
    {
        if(rear == size-1)
        {
            System.out.println("Queue is full");
        }
        else
        {
            if(front == -1)
            {
                front = 0;
            }
            rear++;
            arr[rear] = i;
        }
    }
  public void dequeue()
    {
        if(front == -1)
        {
            System.out.println("Queue is empty");
        }
        else
        {
            System.out.println("Element deleted is "+arr[front]);
            front++;
            if(front > rear)
            {
                front = -1;
                rear = -1;
            }
        }
    }
    public void display()
    {
        if(front == -1)
        {
            System.out.println("Queue is empty");
        }
        else
        {
            for(int i=front;i<=rear;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
public class Test{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Initialize an Queue with size ");
        int size = input.nextInt();
        SimpleQueue q = new SimpleQueue(size);
        
        int option;
        do{
            System.out.println("1. Enqueue an element");
            System.out.println("2. Dequeue an element");
            System.out.println("3. Display the queue");
            System.out.println("4. Exit");

            System.out.print("\nEnter your choice: ");
            option=input.nextInt();

            switch(option)
            {
                case 1:
                    System.out.print("\nEnter a number : ");
                    int num=input.nextInt();
                    q.enqueue(num);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    System.out.println("\nExiting...");
                    break;
            }
        }
        while(option<4);
        input.close();
        if(option>4)
        {
            System.out.println("\nInvalid option\n");
        }
    }
}