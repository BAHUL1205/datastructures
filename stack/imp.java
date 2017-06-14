/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author bahul
 */
class stack{
    
  int[] st = new int[100];   
  int top=-1;  
  boolean isempty(){
      if(top==-1)
      {return true;
          }
      return false;
  }
  
  private void push(int data)
  {
      top++;
      st[top] = data;
  }
  private void pop()
  {
      if(isempty())
      {
          System.out.println("empty");
      }
      else
      {
          System.out.println("pop" + st[top]);
          top--;
      }
  }
  private void print()
  {
      int z;
      z=top;
      while(z!=-1)
      {
          System.out.println(st[z]);
          z--;
      }
      
  }
  void call()
  {
     Scanner sc = new Scanner(System.in);
        int j;
       System.out.println( "Enter : \n" + "1.push \n 2pop   \n3print " );
        j=sc.nextInt();
       switch( j)
        {
        case 1 : push(sc.nextInt());
                 call();//recursive calling
                 break;                 
        case 2: pop();
               call();
               break;
        case 3:   print();
                   call();
                    break;
        default:  exit(0);
                     }

  }
}
public class imp {
    
public static void main(String args[])
{
    stack s1 = new stack();
    s1.call();

}}
