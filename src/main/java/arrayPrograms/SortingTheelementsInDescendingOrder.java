package arrayPrograms;

import java.util.Arrays;
import java.util.Comparator;

public class SortingTheelementsInDescendingOrder {
    public static void main(String[] args) {
        int[] arr={100,2,5,99,22,44,6};
        int temp=0;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Elements in reverse order");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
