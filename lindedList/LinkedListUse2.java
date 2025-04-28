//public class Node<T> {
//
//    T data;
//    Node<T> next;
//
//    Node(T data) {
//        this.data = data;
//        next=null;
//
//    }
//
//}
package lindedList;
import java.util.Scanner;

public class LinkedListUse2 {




    public static Node<Integer> takeInput(){
        Node<Integer> head = null, tail = null;
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();

        while(data  != -1){
            Node<Integer> newNode=new Node<Integer>(data);
            if(head==null){
                head=newNode;
                tail=newNode;
            }else{
//                Node<Integer> temp=head;
//                while(temp.next!=null){
//                    temp=temp.next;
//                }
//                temp.next=newNode;

                tail.next=newNode;
                tail=newNode; //tail=tail.next
             }
            data=sc.nextInt();
        }
        return head;
    }

    public static void print(Node<Integer>head){
            while(head !=null) {
                System.out.print(head.data + " ");
                head = head.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {

            Node<Integer> head=takeInput();
            print(head);
        }
    }



}
