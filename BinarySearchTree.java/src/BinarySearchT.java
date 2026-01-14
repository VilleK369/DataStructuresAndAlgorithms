class Node{
    int key;
    String value;
    Node leftChild;
    Node rightChild;

    public Node(int key, String value){
        this.key=key;
        this.value=value;
    }

    public boolean add(int key,String value){

        if(this.key==key){
            this.value=value;
            return false;
        }

        if(key<this.key){
            if(leftChild==null){
                leftChild= new Node(key, value);
                return true;
            }else{
                return leftChild.add(key, value);
            }
        }else{
            if(rightChild==null){
                rightChild= new Node(key, value);
                return true;
            }else{
                return rightChild.add(key, value);
            }
        }
    }

    public String search(int key){
        if(this.key==key){
            return value;
        }

        if(key<this.key && leftChild!=null){
            return leftChild.search(key);
        }else{
            if(key>this.key && rightChild!=null){
                return rightChild.search(key);
            }
        }

        return null;
    }

    public void inOrder(){
        if(leftChild!=null){
            leftChild.inOrder();
        }
        handle(this);
        if(rightChild!=null){
            rightChild.inOrder();
        }

    }

    //Käy puun lähtien juuresta kohti vasenta alipuuta ja tämän jälkeen käy oikean alipuun

    public void preOrder(){
        handle(this);

        if(leftChild!=null){
            leftChild.preOrder();
        }
        if(rightChild!=null){
            rightChild.preOrder();
        }
    }

    private void handle(Node node){
        System.out.println(node.key+ " : " + node.value);
    }
}

public class BinarySearchT{

    private int count=0;
    private Node root=null;

    public void add(int key, String value){
        if(root==null){
            root= new Node(key, value);
            count=1;
        }else{
            if(root.add(key,value)){
                count++;
            }
        }
    }

    public String bstSearch(int key){
        if(root==null){
            return null;
        }
        return root.search(key);
    }

    public String bstMin(){
        if(root==null){
            return null;
        }
        Node leftNode=root.leftChild;
        while(leftNode.leftChild!=null){
            leftNode=leftNode.leftChild;
        }
        return leftNode.value;
    }

    public String bstMax(){
        if(root ==null){
            return null;
        }

        Node rightNode = root.rightChild;

        while (rightNode.rightChild != null){
            rightNode=rightNode.rightChild;
        }
        return rightNode.value;
    }

    public void bstInOrder(){
        if(root!=null){
            root.inOrder();
        }
    }

    public void bstPreOrder(){
        if(root!=null){
            root.preOrder();
        }
    }
}


