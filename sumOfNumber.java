package LeetCode;
// Take a arrray input and take a target. After taking array & target 
import java.util.Scanner;

class solution{
    public int[] twoSum(int[] nums, int target) {
        int[] sum = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    sum[0]=i;
                    sum[1]=j;
                }
            }
        }
        return sum;
    }
}

public class sumOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[4];
        System.out.print("Enter array element : ");
        for(int i=0; i<array.length; i++){
            array[i] = in.nextInt();
        }
        System.out.print("Enter target : ");
        int t = in.nextInt();
        solution s = new solution();
        int[] hold = new int[2];
        hold = s.twoSum(array, t);
        // for(int i=0; i<hold.length; i++){
        //     System.out.print(hold[i] + ",");
        // }
        System.out.println("[" +hold[0] + "," + hold[1] + "]");
    }
}
