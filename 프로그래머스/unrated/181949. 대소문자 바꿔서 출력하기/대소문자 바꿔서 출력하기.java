import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        //String 추가를 위해 StringBuffer 사용
        StringBuffer sf = new StringBuffer();
        
        for (int i = 0; i < a.length(); i++) {
            String temp = Character.toString(a.charAt(i));
            
            /*
            * 대소문자 판별은 Character.isUpperCase 내장함수 사용
            * 대소문자 변환은 String.toLowerCase/toUpperCase 사용
            */
            if(Character.isUpperCase(a.charAt(i))){
                sf.append(temp.toLowerCase());
            }else{
                sf.append(temp.toUpperCase());
            }
        }
        
        System.out.println(sf);
    }
}