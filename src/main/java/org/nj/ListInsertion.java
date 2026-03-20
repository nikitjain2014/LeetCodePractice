package org.nj;

public class ListInsertion {

    public static void main(String[] args) {
        int result=807;
        ListNode head=null;
        if(result>0){
            head= append(head,result%10);
        }
        while((result/10)>0){
            result=result/10;
            head= append(head,result%10);
        }

        System.out.println(head);

    }

    public static ListNode append(ListNode head,int new_data)
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

    /*public static ListNode inserIntIntoListNode(int sum){
        ListNode result=null;

        ListNode current=null;
        if(sum>0){
            head=new ListNode(sum%10);
          //  sum=sum/10;
        }

        while((sum/10)>0){
            sum=sum/10;
            current=new ListNode(sum%10);
            head.next=current;
            result=head;
        }
                return head;
    }*/
}
