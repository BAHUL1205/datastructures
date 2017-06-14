/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author bahul
 */
class queue { 
    int front=-1;
    int rear=0;
    int a[]= new int[100];
    boolean isempty(){
        if(front==rear || front+1==rear)
        {
            return false;
        } else {
            return true;
        }
    
    }
    
    public void enqueu(int data){
        front++;
        a[front]=data;
    }
    public void deque(){
        if(isempty()){
        front--;
        rear++;
        System.out.println(a[front]);
    }
    }
    public void print()
    {
        int f =front;
        int r =rear;
       while(f!=r)
       {
           System.out.print(a[front]);
           f--;
       }
    }
   
}

class imp2 extends queue{
    public void call()
    {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
      switch( k)
        {
        case 1 : print();
                 call();//recursive calling
                 break;                 
        case 2 : enqueu(sc.nextInt());
                 call();
                 break;    
        case 3 :  deque();
                  call();
                  break;
         }
    
    }
}

public class imp {
    public static void main(String args[])
    {
     imp2 i1 = new imp2();
     i1.call();
    }
}
