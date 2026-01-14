public class App {

    public static void main(String[] args) {
         int array[]=new int[6001];
         int low=0;
         int high=array.length-1;

        for(int i=0; i<=6000; i++){
            array[i]=i+1;
        }

         PuolitusHakuAlgo testi = new PuolitusHakuAlgo();

         int index=testi.binarySearch(array,5001 , low, high);


         System.out.println(index);

        
         System.out.println(array[5000]);

         
    }
    
}
