

public class QueueAlgorithms{

    private int head;
    private int tail;
    private int count;
    private int[] itemArray;

    public QueueAlgorithms(){
        itemArray=new int[10];
        head=0;
        tail=0;
        count=0;
    }


    //Toteutetaan ensin enqueue(e) jolla voidaan lisätä jonoon elementtejä
    


    public void enqueue(int e){

        if(count==itemArray.length){
            reallocateArray();
            System.out.println("Reallocating the array");
        }

        if(tail>=itemArray.length && head>0){
            tail=0;
        }
        itemArray[tail]=e;
        tail++;
        count++;
    }

    public void reallocateArray(){
        int [] newArray = new int[itemArray.length*2];
        int newArrayIndex=0;
        int index=head;
        int counter=count;
        while(counter>0){
            newArray[newArrayIndex]=itemArray[index];
            newArrayIndex++;
            index++;
            counter--;
            if(index>=itemArray.length){
                index=0;
            }
        }

        head=0;
        tail=count;
        itemArray=newArray;
    }


    public int dequeue(){
        if(count == 0){
            throw new NullPointerException("Cannot dequeue from empty queue");
        }

        int x=itemArray[head];
        head++;
        count--;
        if(head>=itemArray.length){
            head=0;
        }
        return x;
    }


    public void clear(){
        head=0;
        tail=0;
        count=0;
    }

    public boolean isEmpty(){
        return count==0;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }

        return itemArray[head];
    }

}