
package String_Level1.Programming_Questions;

import java.util.Scanner;


public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='A' && s.charAt(i)<='Z')
            {
                count++;
            }
         }
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                count++;
            }
         }
        System.out.println(count);
    }

   
}
