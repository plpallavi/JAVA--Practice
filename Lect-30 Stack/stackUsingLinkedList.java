// Operation in stack
//-- Push (TC_> O(1))
//-- Pop (TC_> O(1))
//-- Peek (TC_> O(1))
// Stack can be implemented using array, linkedlist and arrayList

public class stackUsingLinkedList {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Stack {
        public static Node head;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                if(isEmpty()){
                    head = newNode;
                    return;
                }

                newNode.next = head;
                head = newNode;

            }

            public static int pop(){

            }
        }
    }

    public static void main(String[] args) {

    }
}