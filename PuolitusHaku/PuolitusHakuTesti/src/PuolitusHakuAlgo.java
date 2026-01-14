public class PuolitusHakuAlgo{

    int binarySearch(int array[], int key, int low, int high){

        
        if(low==high){
            if(array[low]==key){
                return low;
            }else{
                return -1;
            }
        }else{
            int middle=low+(high-low)/2;

            if(key==array[middle]){
                return middle;
            }

            if(key<array[middle]){
                System.out.println("Arvo on vasemmalla puolella taulukkoa: keskimmäinen arvo: "+middle);
                return binarySearch(array, key, low, middle);
            }else{
                System.out.println("Arvo on oikealla puolella taulukkoa: keskimmäinen arvo: "+middle);
                return binarySearch(array, key, middle+1, high);
            }
        }
    }
}