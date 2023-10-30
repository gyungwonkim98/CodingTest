import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        System.out.println(a+b.trim());
        
        // 직관적인 코드
        // String temp = a+b;
        // System.out.println(temp.trim());
    }
}