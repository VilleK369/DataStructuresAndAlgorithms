

public class App {
    public static void main(String[] args) throws Exception {
        BinarySearchT tree = new BinarySearchT();

        tree.add(60, "root");
        tree.add(55, "puu");
        tree.add(10, "Koivu");
        tree.add(4, "Haapa");
        tree.add(80, "Lehti");
        tree.add(100, "Node");


        int searchedKey=4;
        String value = tree.bstSearch(searchedKey);

        if(value!=null){
            System.out.println("Key "+ searchedKey + " Found, value = " +value);
        }else{
            System.out.println("Key " + searchedKey + " Not Found");
        }


        searchedKey=20;
        value=tree.bstSearch(searchedKey);

        if(value!=null){
            System.out.println("Key "+ searchedKey + "Found, value = " +value);
        }else{
            System.out.println("Key " + searchedKey + " Not Found");
        }

        tree.bstInOrder();

        System.out.println();

        tree.bstPreOrder();

    }
}
