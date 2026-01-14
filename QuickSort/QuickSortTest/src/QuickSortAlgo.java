
import java.lang.reflect.Array;

public class QuickSortAlgo{


    //Luodaan ensin Hoaren partitiointi algoritmi
    //Quicksort toimii siten, että valitaan lajittelemattomasta (tai lajitellusta) aineistosta
    //Sarana-arvo eli pivot arvo. Kaikki tätä pivot arvoa pienemmät tulevat pivotin vasemmalle puolelle 
    //Kun taas kaikki pivottia suuremmat arvot sijoitetaan oikealle puolelle
    //Quicksort on rekursiivinen algoritmi, joten tätä pilkkomista sarana-arvon mukaan tehdään niin kauan kunnes
    //Taulukon low --> high


    static int partition(int[] array, int low, int high){
        int n=array.length;
        int pivot=array[low+(high-low)/2];
        int i=low-1;
        int j=high+1;

        //Edetään i ideksiä niin kauan kunnes löydetään taulukosta arvo
        //Joka on suurempi kuin pivot arvo
    while(true){
        do { 
            i++;
        } while (array[i]<pivot);

        //Liikutaan taulukon lopusta kohti alkua j indeksillä kunnes
        //löydetään arvo joka on pienempi kuin pivot arvo

        do { 
            j--;
        } while (array[j]>pivot);

        if(i>=j){
        return j;
        }

        //vaihdetaan indeksissä olevien arvojen paikkoja 

        swap(array, i, j);

        
        
     }
    }

    private static  void swap(int[] array, int i, int j){

        int temp;

        temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }

    static void quickSort(int[] array, int low, int high){

        if(low<high){
            int partitionIndex=partition(array, low, high);
            quickSort(array, low, partitionIndex);
            quickSort(array, partitionIndex+1, high);


        }
    }

}