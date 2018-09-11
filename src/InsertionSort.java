public class InsertionSort {

    void insertionSort(int[] list){
        for(int j = 1; j < list.length; j++){
            int i = 0;
            while(list[j] > list[i]){
                i++;
            }
            int m = list[j];
            for(int k = -1; k < (j-i-1); k++){
                list[j-k] = list[j-k-1];
            }
            list[i] = m;
        }
        System.out.print("Insertion sort: ");
        for(int e: list){
            System.out.print(e + " ");
        }
    }

}
