package questionsOnLeetcode;
import java.util.Scanner;
public class GuessHigherOrLower_364 {
    public static int guess(int num,int n){
        // In leetcode this function doesn't needs to be created
        int pick=(int)(Math.random() * n);
        if(num==pick){
            return 0;
        }else if(num<pick){
            return 1;
        }else{
            return -1;
        }
    }
    public static int number(int n){
        int start=0;
        int end=n;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(guess(mid,n)==0){
                return mid;
            }else if(guess(mid,n)==1){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      // pick is the number that is picked
      // num is the number that we calculate
        // number ranges from 0 to n
        System.out.println("Enter the value of n : ");
        int n=sc.nextInt();
        System.out.println(number(n));


    }
}
