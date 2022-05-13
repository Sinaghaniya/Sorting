import java.util.Scanner;

public class SelectionSort {

    static void PrintArray(int arr[],int n){

        for(int i=0;i<n;i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        //OuterLoop
        for(int i=0;i<arr.length-1;i++){
            int Smallest = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[Smallest]>arr[j]){
                    Smallest = j;
                }
            }
            int swap = arr[Smallest];
            arr[Smallest] = arr[i];
            arr[i] = swap;
        }

        PrintArray(arr,n);
    }
}
