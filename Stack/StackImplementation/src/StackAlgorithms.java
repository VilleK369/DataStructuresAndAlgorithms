public class StackAlgorithms{


    private int maxSize;
    private Integer[]stackArray;
    private Integer top;
    private int count;


    public StackAlgorithms(int size){
        if(size<0){
            throw new IllegalArgumentException("Size cannot be less than zero");
        }
        maxSize=size;
        stackArray=new Integer[maxSize];
        top=-1;
    }

    private void reallocate(){
        maxSize=stackArray.length*2;
        Integer [] newItemArray= new Integer[maxSize];
        

        for(int i=0; i<=top;i++){
            newItemArray[i]=stackArray[i];
        }
        stackArray=newItemArray;
    }

    public void push(Integer element){
        if(element==null){
            throw new IllegalArgumentException("Element to push cannot be null");
        }

        if(top==stackArray.length-1){
            System.out.println("Stack needs to be reallocated");
            reallocate();
        }
        top++;

        stackArray[top]=element;

        count++;
    }

    public boolean  isEmpty(){
        return top==-1;
    }

    public Integer pop(){
        if(isEmpty()){
            throw new IllegalArgumentException("Cannot pop from empty stack");
        }

        int element=stackArray[top];

        stackArray[top]=null;

        top--;

        return element;

    }

    public int count(){
        return count;
    }

    public Integer peek(){
        if(isEmpty()){
            throw new IllegalArgumentException("Stack is empty");
        }
        return stackArray[top];
    }

    public boolean contains(Integer element){

        if(element==null){
            throw new IllegalArgumentException("Element to check cannot be null");
        }

        for(int i=0; i<=top;i++){
            if(element.equals(stackArray[i])){
                System.out.println("Stack contais the element:" + element);
                return true;
            }
        }
        System.out.println("Stack doesn't contain the element");
        return false;
    }


    public String toString(){
        
        if(isEmpty()){
            return "Stack:[]";
        }

        StringBuilder sb= new StringBuilder();

        sb.append("Stack from Top to Bottom: [");

        for(int i=top; i>=0;i--){
            sb.append(stackArray[i]);
            if(i>0){
                sb.append(", ");
            }
        }

        sb.append("]");
        return sb.toString();
    }

    public int size(){
        return count;
    }

    public int capacity(){
        return maxSize;
    }



}