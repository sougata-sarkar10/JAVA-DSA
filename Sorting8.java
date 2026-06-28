public class Sorting8{

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print( arr[i]);
        }
    }
    public static void main(String arg[]){
        int[] arr = {7,8,3,1,2};
        int n = arr.length;

        //Bubble Sort

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                }
            }
        }

        System.out.print("BUBBLE SORT :");
        printArr(arr);

        System.out.println();

        //Selection Sort 

        for(int i=0; i<n-1; i++){
            int smallest = i;
            for(int j=i+1; j<n; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        System.out.print("Selection Sort : ");
        printArr(arr);

        System.out.println();

        //Intertion Sort 

        for(int i=0; i<n; i++){
            int curr = arr[i];
            int j = i-1;

            while(j>=0 && curr < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }

        System.out.print("INSERTION SORT :");
        printArr(arr);

    }
}