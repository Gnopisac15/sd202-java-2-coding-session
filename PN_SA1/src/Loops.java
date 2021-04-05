
import java.util.Scanner;

public class Loops {
    public static boolean isPalindrome(int a[]) {
            for (int i = 0; i < a.length / 2; ++i) {
            if (a[i] != a[a.length - 1 - i]) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void displayArray(int a[]) {
        System.out.print("{");
        for(int i=0; i<a.length; ++i) {
            System.out.print(a[i]);
            if(i<a.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
