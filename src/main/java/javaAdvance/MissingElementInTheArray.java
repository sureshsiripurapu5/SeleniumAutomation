package javaAdvance;

import java.util.Arrays;

public class MissingElementInTheArray {
    public static void main(String[] args) {
        int [] arr1={1,2,3,4,6,7,8,9};
        int countNum=arr1.length+1;

        int s1=countNum*(countNum+1)/2;
        int s2 = 0;
        for(int i=0;i<arr1.length;i++){
            s2=s2+arr1[i];
        }
        int missing=s1-s2;
        System.out.println("Missing element in the array::"+missing);

        int s3= Arrays.stream(arr1).sum();
        int missing1=s1-s3;
        System.out.println(missing1);

    }
}
