
import java.util.Scanner;

public class BubbleSort {

    static void PrintArray(int arr[],int n){

        System.out.println("Sorted Array in Ascending Order");

        for(int i=0;i<n;i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Your Array");

        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the inputs of your Array");

        for(int i=0;i<n;i++){ //Declaration of an Array
            arr[i]= sc.nextInt();
        }

        //OuterLoop

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                }
            }
        }

        PrintArray(arr,n);

    }
}
