package link012;
import static java.lang.System.exit;
import java.util.Scanner;
/**
 *
 * @author bahul
 */
class nod01{
    int data;
    nod01 next;
    nod01(int data){
       
        this.data=data;
        nod01 next =null;
        
   }
}
class linkedlist
{
    int     n0=0;
      int  n1=0;
       int n2=0;
   
   nod01 head=null;
int k;
int length=0;
public void add()
{   Scanner sc = new Scanner(System.in);
    System.out.println("enter the no \n");
       
    if(head==null)//checking head condition
    {
     nod01 n =new nod01( k=sc.nextInt());
     length++;
       head = n;
    }
    else{//traversing till the end
    nod01 temp=head;//refrence variable
    while(temp.next!=null)
    {
        temp=temp.next;//reaching the end 
        
    }
    nod01 n =new nod01( k=sc.nextInt());
    length++;
    temp.next=n;//changing adress;
    
    }    }
private void count()
{
   nod01 temp;
    temp=head;
    if(head==null){
        System.out.println("empty");
    }
else{ temp=head;
        while(temp.next!=null)
        {   
            
            switch (temp.data) {
                 case 0:
                     n0++;
                    temp=temp.next;
                    break;
                case 1:
                    n1++;
                    temp=temp.next;
                    break;
                case 2:
                    n2++;
                    temp=temp.next;
                    break;
                default:
                    break;
            }
    }
    
       
    System.out.println(" " + n0 + "   " +n1 + "   "  + n2);
}
}
public void sort(){
nod01 temp=head;
    
    if(head==null){
        System.out.println("empty");
    }
    else{
        
    while(temp.next!=null){
       if(j<n0){
       temp.data=0;
       j++;
       temp=temp.next;
    
       }
       else if(j>n0 && j<n0+n1)
       {
           temp.data=1;
           temp=temp.next;
           j++;
       }
       else if(j>n0+n1 && j<n0+n1+n2 ){
           temp.data=2;
           temp=temp.next;
           j++;
       }
     }
    }
}
    public void print()
    {nod01 temp;
      temp=head;
    if(head==null)
    {
        System.out.println("empty");
      }
    else
    {  
    while( (temp.next!=null) )
    {
        System.out.println(temp.data);
        temp=temp.next;//couldnt print last as it check the condition first
 }
    System.out.println(temp.data);
     }
}
public void call()
{
 Scanner sc = new Scanner(System.in);
        int j;
       System.out.println( "Enter : \n" + "1.add \n 2count  \n 3sort \n4print " );
        j=sc.nextInt();
       switch( j)
        {
        case 1 : add();
                 call();//recursive calling
                 break;                 
        case 2: count();
               call();
               break;
        case 3:   sort();
                   call();
                    break;
        case 4: print();
                call();
                break;

        default:  exit(0);
                     }

}
}public class link {
public static void main(String args[])
{
    linkedlist l1 = new linkedlist();
    l1.call();
    
}
 }
    

