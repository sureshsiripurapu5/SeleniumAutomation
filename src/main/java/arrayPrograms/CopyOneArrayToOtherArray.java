package arrayPrograms;

public class CopyOneArrayToOtherArray {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6,7,8,9};
        //create other array with arr1 length
        int[] arr2=new int[arr1.length];

        for(int i=0;i<arr1.length;i++){
            arr2[i]=arr1[i];  //copying arr1 elements to arr2
        }
        //displaying arr1
        for(int i=0;i< arr1.length;i++){
            System.out.print(arr1[i]);
        }
        System.out.println();
        //displaying arr2 copied elements
        for(int i=0;i< arr2.length;i++){
            System.out.print(arr2[i]);
        }



    }
}
