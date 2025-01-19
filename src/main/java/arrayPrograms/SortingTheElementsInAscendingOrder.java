package arrayPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingTheElementsInAscendingOrder {
    public static void main(String[] args) {
        int[] arr={100,2,5,99,22,44,6};
        int temp=0;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Elements in ascending order");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        Arrays.stream(arr).sorted().forEach(s-> System.out.println(s));
    }
}
