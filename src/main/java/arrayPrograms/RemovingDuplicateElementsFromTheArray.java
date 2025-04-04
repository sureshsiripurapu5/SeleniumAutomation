package arrayPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemovingDuplicateElementsFromTheArray {
    public static void main(String[] args) {
        int[] arr1={1,1,2,3,4,5,5};
        int a1=0;
        int a2=0;
        for (int i=0;i<arr1.length;i++){
            for(int j=i+1;j<arr1.length;j++){
                if(arr1[i]==arr1[j]){
                    a1=a1+arr1[i];
                    break;
                }
                else{
                    a2=arr1[i]+arr1[j];
                }

            }
        }
        int sum=a1+a2;
        System.out.println(sum);

//        int sum = Arrays.stream(arr1).distinct().sum();
//        System.out.println(sum);

    }
}
