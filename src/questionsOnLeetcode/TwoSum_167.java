package questionsOnLeetcode;
import java.util.Arrays;
import java.util.Scanner;
public class TwoSum_167 {
    public static int[] sum(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int[] ans={0,0};
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid+(mid+1)==target){
                ans[0]=mid+1;
                ans[1]=mid+2;
                return ans;
            }
            if(mid+(mid-1)==target){
                ans[0]=mid;
                ans[1]=mid+1;
                return ans;
            }else if(mid+(mid+1)>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        ans[0]=-1;
        ans[1]=-1;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Array index starts from 1
        // Mileko xaina complete it after studying two pointer
        int[] arr={1,3,4,5,7};
        System.out.println("Enter the target : ");
        int target=sc.nextInt();
        System.out.println(Arrays.toString(sum(arr,target)));

    }
}
