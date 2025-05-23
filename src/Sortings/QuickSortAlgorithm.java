class Solution{

    public int partition(int[] arr, int low, int high){

        int pivot = arr[low];

        int i = low;
        int j = high;

        while(i<j){

            while(arr[i] <= pivot && i <= high-1){

                i++;
            }

            while(arr[j]>pivot && j >= low+1){

                j--;
            }

            if(i<j){

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp2 = arr[low];
        arr[low] = arr[j];
        arr[j] = temp2;

        return j;
    }

    public void quickSortHelper(int[] arr, int low, int high){

        if(low < high){

            int pIndex = partition(arr, low, high);

            quickSortHelper(arr, low, pIndex - 1);

            quickSortHelper(arr, pIndex + 1, high);
        }
    }

    public int[] quickSort(int[] arr){

        int n = arr.length;

        quickSortHelper(arr, 0, n-1);

        return arr;
    }
}

public class QuickSortAlgorithm{

    public static void main(String[] args){

        int[] arr = {10, 7, 8, 9, 1, 5};

        int n = arr.length;

        System.out.println("Unsorted array: ");

        for(int i=0;i<n;i++){

            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // Create an instance of the Solution class
        Solution solution = new Solution();

        int[] sortedArr = solution.quickSort(arr);

        System.out.println("Sorted array: ");

        for(int j=0;j<n;j++){

            System.out.print(sortedArr[j] + " ");
        }

        System.out.println();
    }

}