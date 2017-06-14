package linkedlist;
import static java.lang.System.exit;
import java.util.Scanner;


class  node{
    int data;
    node next;
    node(int data){
        this.data=data;
        node next=null;
    }
}

 abstract class linkedlist {
node head=null;
int k;
int length=0;
linkedlist()
{
    
}
public void add()
{   
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the no \n");
    if(head==null)//checking head condition
    {
     node n =new node( k=sc.nextInt());
     length++;
       head = n;
    }
    else{//traversing till the end
    node temp=head;//refrence variable
    while(temp.next!=null)
    {
        temp=temp.next;//reaching the end 
    }
    node n =new node( k=sc.nextInt());
    length++;
    
    temp.next=n;//changing adress;
    
    }    
}   
public void print()
{
    node temp;
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
public void deletefromlast()
{node temp;
node deletenode=null;
    temp=head;
    if(head==null)
    {
        System.out.println("empty");
        
    }
    else
    {
    while( (temp.next!=null) )
     { 
         deletenode=temp;//understanding part we cant make end node null we have to make next null 
       temp=temp.next;
     }
    deletenode.next=null;
    length--;
    }    
}
public void deleteinb()
{
    node temp;
    node inb=head;
    temp=head;
    if(temp==null){
        System.out.println("empty");
    }
else{
        System.out.println("enter the no to be deletd");
        Scanner sc = new Scanner(System.in);
        int k;
        int c=1;
        k=sc.nextInt();
        while(temp.next!=null&&length>=2)
        {   if(k==temp.data)
            {
                c=0;
                System.out.println("Number found");
                inb.next=temp.next;
                length--;
                break;            
            }
            else
            {
                inb=temp;
                    }
            temp=temp.next;
        }
        if (c==1)
        {
                System.out.println("Number not found");
            }
    }}
public void revorder(){
    node temp;
    temp=head;
    if(head==null)
    {
        System.out.println("empty");
  }
    else
    {int l=1;
    int i=0;
    node temp2;
    temp2=head;
    temp=head;
        while(temp.next!=null)
        {
          temp2=head;
         for( i = 0; i<=(length-l-1) ; i++)
        {
            temp2=temp2.next;
        }
        System.out.print("\n" + temp2.data + "\n");
         if(l==length-1)
          {
              System.out.println(head.data);
          }
        
        temp=temp.next;
        l++;
       
        }
    }
    
}

public void mid()
{
    node temp;
    node temp2;
 temp=head;
 temp2=head;
 int le=0;
 
 while(temp2!=null && temp2.next!=null )
 {
     temp2=temp2.next.next;
     temp=temp.next;
  }
 System.out.print("Mide value is: " + temp.data);
         
}
public void length()
{
    System.out.println(""+ length);
}

abstract void pallindrome();
abstract void sort();


public void call()
   {    Scanner sc = new Scanner(System.in);
        int j;
       System.out.println( "Enter : \n" + "1.additon \n 2 print  \n 3 deletefromlast \n 4 delinbetween \n5 rev.order \n6lenght \n7mid\n8pallindrome \n9exit");
        j=sc.nextInt();
       switch( j)
        {
        case 1 : add();
                 call();//recursive calling
                 break;                 
        case 2 : print();
                 call();
                 break;    
        case 3 :  deletefromlast();
                  call();
                  break;
        case 4 :  deleteinb();
                  call();
                  break;        
        case 5   : revorder();
                    call();
                    break;
        case 6   : length();
                     call();
                     break;
        case 7   : mid();
                   call();
                   break;
                    
        case 8   : pallindrome();
                    call();
                    break;
                  
        default:  exit(0);
                     }
                            }

 }
 public class calling
{public static void main(String args[]){
  linkedlist l1 = new lcc();
  l1.call();// you need this because absttact defination is somewher eelse
  l1.pallindrome();
 }
 }