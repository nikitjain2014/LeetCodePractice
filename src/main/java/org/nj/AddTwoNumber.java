package org.nj;

import java.util.ArrayList;
import java.util.List;

public class AddTwoNumber {
    public static void main(String[] args) {
        ListNode l11=new ListNode(1,null);
        //ListNode l13=new ListNode(3,null);
        //ListNode l12=new ListNode(4,l13);
        //ListNode l11=new ListNode(2,l12);


        ListNode l30=new ListNode(9,null);
        ListNode l29=new ListNode(9,l30);
        ListNode l28=new ListNode(9,l29);
        ListNode l27=new ListNode(9,l28);
        ListNode l26=new ListNode(9,l27);
        ListNode l25=new ListNode(9,l26);
        ListNode l24=new ListNode(9,l25);
        ListNode l23=new ListNode(9,l24);
        ListNode l22=new ListNode(9,l23);
        ListNode l21=new ListNode(1,l22);

        ListNode resultSum=addTwoNumbers(l11,l21);

        //System.out.println();
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Long> l1InputList=new ArrayList<Long>();
        List<Long> l2InputList=new ArrayList<Long>();
        while (l1!=null){
            l1InputList.add(l1.val);
            l1=l1.next;
        }
        while (l2!=null){
            l2InputList.add(l2.val);
            l2=l2.next;
        }

        StringBuffer l1InputAsString=new StringBuffer("");
        for(int i=l1InputList.size()-1;i>=0;i--)
            l1InputAsString.append(l1InputList.get(i));
        System.out.println("First Number As Input:"+l1InputAsString.toString());

        StringBuffer l2InputAsString=new StringBuffer("");
        for(int i=l2InputList.size()-1;i>=0;i--)
            l2InputAsString.append(l2InputList.get(i));
        System.out.println("Second Number As Input:"+l2InputAsString.toString());

        long result=Long.parseLong(l1InputAsString.toString())+Long.parseLong(l2InputAsString.toString());
        System.out.println("Sum:"+result);

        ListNode head=null;
        if(result>0){
            head= append(head,result%10);
        }
        else{
            head=new ListNode(0,null);
        }
        while((result/10)>0){
            result=result/10;
            head= append(head,result%10);
        }
        return head;
    }

    public static ListNode append(ListNode head,long new_data)
    {
    /* 1. Allocate the Node &
       2. Put in the data
       3. Set next as null */
        ListNode new_node = new ListNode(new_data);

    /* 4. If the Linked List is empty, then
          make the new node as head */
        if (head == null)
        {
            head = new ListNode(new_data);
            return head;
        }

    /* 4. This new node is going to be the
          last node, so make next of it
          as null */
        new_node.next = null;

        // 5. Else traverse till the last node
        ListNode last = head;
        while (last.next != null)
            last = last.next;

        // 6. Change the next of last node
        last.next = new_node;
        return head;
    }



}


