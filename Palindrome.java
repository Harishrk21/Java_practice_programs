import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int rev=0;
        int temp=num;
        while(num>0)
        {
          rev =rev*10+num%10;
          num=num/10;  
        }
        System.out.println("The reverse order of a number is :"+rev);
        if(temp==rev)
        {
            System.out.println("It is a palindrome number");

        }
        else
        {
            System.out.println("It is not a palindrome number");
        }
    }
}
