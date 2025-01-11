import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int [] num = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(num));
        System.out.println(Arrays.toString(num));
    }

    public static int removeDuplicates(int[] num) {

        int l = 1;

        for (int r =1 ; r<num.length ; r++){
            if (num[r] == num [r-1]) {
                continue;
            }
            else {
                num[l]=num[r];
                l++;
            }
        }
        return l;
    }
}
