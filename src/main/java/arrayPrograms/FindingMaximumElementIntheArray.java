package arrayPrograms;

public class FindingMaximumElementIntheArray {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,55,2,1};
        int max=arr1[0];

        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>max){
                max=arr1[i];
            }
        }
        System.out.println("Maximu element::"+max);
    }
}
