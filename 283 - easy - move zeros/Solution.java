import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        int[] nums = {0,0,1};
        moveZeros(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeros(int [] nums){

        int end=nums.length-1;
        for (int i = 0 ; i<=end; i++){
            for (int j=0 ; j <end; j++){

                if (nums[j]==0){
                    int temp= nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j]=temp;
                }
            }
        }
    }
}
