package Palindrome;
import java.util.*;

public class palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(ispalin(input,0,input.length()-1));

    }

    static boolean ispalin(String input, int start, int end) {
        if(start>end){
            return true;
        } else if (input.charAt(start)!=input.charAt(end)) {
            return false;
        }
        else{
            return ispalin(input,start+1,end-1);
        }
    }
}