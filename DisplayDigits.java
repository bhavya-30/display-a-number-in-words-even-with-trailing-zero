package displaydigits;
import java.util.Scanner;
public class DisplayDigits {
    public static void main(String[] args) {
       int num,r,count=0;
       System.out.println("enter any number");
       Scanner s=new Scanner(System.in);
       num=s.nextInt();
       while(num>0)
       {
           r=num%10;
           num=num/10;
           count++;
           System.out.println(r);
       }
       System.out.println("number of digits:"+count);
    }
    
}
