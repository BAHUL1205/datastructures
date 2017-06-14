/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import static java.time.Clock.system;

/**
 *
 * @author bahul
 */
class lcc extends linkedlist{
    void lcc()
    {
        
    }
    public void pallindrome()
{
    node  temp;
    node  temp2;
    temp2=head;
    temp=head;
    int t=0;
    int k=0;
    if(head==null)
    {
        System.out.println("empty");
  }
    while(temp.next!=null)
    {
        temp2=head;
        for(int i=0 ;i<=(length-1-k);i++)
        {
            temp2=temp2.next;}  
        temp=temp.next;
      if(temp.data!=temp2.data)
        { t=1;
            System.out.println("not a pallindrome");
            break;
        }
    k++;
    }if(t==0)
        {
            System.out.println("pallindrome");
        }
    }

    @Override
    void sort() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

public class llc {
    public static void main(String args[])
    {
linkedlist l1 = new lcc();

if(l1.length>1 && l1 instanceof lcc)
{
  
 ((lcc)l1).pallindrome();  
}
}
}
