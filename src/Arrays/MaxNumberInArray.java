package Arrays;

public class MaxNumberInArray {
    public static void main(String[] args) {
        int [] numbers =  {4,2,9,12,5,7};
        int max = findMax(numbers);
        System.out.println("MaxNumber is:" + max);
    }

    public  static int findMax(int[] arr) {
       int max=arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i]> max){
                max = arr[i];
            }
        }
        return max;
    }
}
