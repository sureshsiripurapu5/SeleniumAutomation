package arrayPrograms;

public class RemovingDuplicateElementsFromTheArray {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,2,5,6,8,3};

        for (int i=0;i<arr1.length;i++){
            for(int j=i+1;j<arr1.length;j++){
                if(arr1[i]==arr1[j]){
                    System.out.println("Duplicate elements are::"+arr1[i]);
                    break;
                }

            }
        }

    }
}
