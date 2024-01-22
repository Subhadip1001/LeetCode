package LeetCode;
import java.util.Scanner;

class solution2{
    private int reminder;
    private int reverse;
    public int result(int number){
        while(number != 0){
            reminder = number % 10;
            if(reverse > Integer.MAX_VALUE / 10 || reverse < Integer.MIN_VALUE / 10){
                return 0;
            }
            reverse = reverse * 10 + reminder;
            number /= 10;
        }
        return reverse;
    }
}
public class reverseInterger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();
        solution2 s2 = new solution2();
        int res2 = s2.result(number);
        System.out.println("Ans : " + res2);
    }
}
