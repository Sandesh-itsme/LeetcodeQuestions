package questionsOnLeetcode;
import java.util.Scanner;
public class firstBadVersion_278 {
    public static boolean version(int n,int target){
        int version=(int)(Math.random() * n);
        if(version<=target){
            return true;
        }else{
            return false;
        }
    }
    public static int badVersion(int n){
        int start=0;
        int end=n;
        int ans=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(version(n,mid)==true){
                ans=mid; // It can be possible answer
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n=sc.nextInt();
        System.out.println(badVersion(n));
    }
}
