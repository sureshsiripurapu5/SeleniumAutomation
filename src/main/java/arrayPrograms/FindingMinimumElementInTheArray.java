package arrayPrograms;

public class FindingMinimumElementInTheArray {
    public static void main(String[] args) {
        int[] arr={55,2,3,4,55,6,2};
        int min=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum Element::"+min);
    }
}
