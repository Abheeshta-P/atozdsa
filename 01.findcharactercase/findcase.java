import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //to read character we use .charAt(0)
        char symbol=sc.next().charAt(0);
        if(65<=symbol&&symbol<=90)
        System.out.println("1");
        else if(97<=symbol&&symbol<=122)
        System.out.println("0");
        else
        System.out.println("-1");
    }
}