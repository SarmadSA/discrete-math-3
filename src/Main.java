public class Main {
    public static void main(String[] args) {

        //Enter array to be sorted here
        int[] arr={4,5,6,0,7,8,9,1,2,3};

        BogoSort now=new BogoSort();
        System.out.print("Unsorted: ");
        now.display1D(arr);

        now.bogo(arr);

        System.out.print("Sorted: ");
        now.display1D(arr);

        InsertionSort ins = new InsertionSort();
        ins.insertionSort(arr);

    }
}
