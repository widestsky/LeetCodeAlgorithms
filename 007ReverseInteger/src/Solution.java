import java.util.Arrays;


public class Solution {
//	Given a 32-bit signed integer, reverse digits of an integer.
	public int reverse(int num) {
		int n = 0;
		if(num<0){
			n = num*-1;
		} else {
			n = num;
		}
        int len = 9;//point to the highest unit of 10 digit integer
        int[] units = new int[10];//32 bit signed integer has 10 digits maximum
        int result=0;
        while(n>0){
        	units[len]=n%10;
        	len = len-1;
        	n = n/10;
        }
        int maxUnit = 9 - len;
        int[] rUnits = new int[maxUnit];
        for(int i = maxUnit-1; i>=0; i--){
        	rUnits[i]=units[9-i];
        }
        for(int i = 0; i<maxUnit; i++){
        	result = result + rUnits[maxUnit-1-i]*(int)Math.pow(10, i);
        }
//        System.out.print(Arrays.toString(rUnits));
        if(num<0){
        	result = result*-1;
        }
		return result;
    }
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		int num = -123450;
		int result = sol.reverse(num);
		System.out.printf("%d", result);
	}

}