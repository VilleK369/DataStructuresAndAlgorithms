



public class LinkedList{


static class Node{
    int data;
    Node next;
    Node previous;

        public Node(int d) {
            data=d;
            next=null;
            previous=null;

        }
    }

    private Node head;
    private Node tail;
    private int count;


    public LinkedList(){
        head=null;
        tail=null;
        count=0;
    }

    //This method inserts element to the beginning of the list
    public void insert(int data){

        Node newNode = new Node(data);

        if(head==null){
            head=newNode;
            tail=newNode;
            count=1;
        }else{
            newNode.next=head;
            head.previous=newNode;
            head=newNode;
            newNode.previous=null;
            count++;
        }

    }

    //This method adds element to the end of the list
    public void add(int data){
        Node newNode=new Node(data);


        if(head==null){
            head=newNode;
            tail=newNode;
            count=1;
        }else{
            tail.next=newNode;
            newNode.previous=tail;
            newNode.next=null;
            tail=newNode;
            count++;

        }
    }

    //Method that takes care of the unlinking of nodes 
    private void unLink(Node nodeToRemove){

        if(nodeToRemove.previous!=null){
            nodeToRemove.previous.next=nodeToRemove.next;
        }else{
            head=nodeToRemove.next;
            if(head==null){
                tail=null;
            }
        }

        if(nodeToRemove.next!=null){
            nodeToRemove.next.previous=nodeToRemove.previous;
        }else{
            tail=nodeToRemove.previous;
            if(tail==null){
                head=null;
            }
        }
        count--;

    }
    //Method tells if removing element was successfull or not 
    public boolean remove(int data){

        Node toRemove=head;

        while(toRemove!=null){
            if(toRemove.data==data){
                unLink(toRemove);
                System.out.println("Removed element: "+toRemove.data);
                return true;
            }
            toRemove=toRemove.next;
        }
        return false;
    }


    public int get(int index){
        if(head==null){
            throw new RuntimeException("List is empty");
        }else{
            Node current;
            if(index<count/2){
                int counter = 0;
                current = head;

                while(current!=null && counter<index){
                    current=current.next;
                    counter++;
                }
            }else{
                int counter=count-1;
                current = tail;

                while(current!=null && counter>index){
                    current=current.previous;
                    counter--;
                }
            }
            return current.data;
        }

    


    }

    public void printList(){

        Node current = head;

        System.out.print("LinkedList: ");

        while(current!=null){
            System.out.print(current.data+" ");

            current=current.next;
        }

        

    }






}

