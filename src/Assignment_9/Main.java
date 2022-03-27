package Assignment_9;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Main
{
    public static void Check(String s1) {
        String regexPattern="[A-Z].*[.]";
        boolean flag=Pattern.matches(regexPattern, s1);
        if(flag){
            System.out.println("Yes the given pattern matched the regex");
        }
        else{
            System.out.println("No the given pattern does not matches the regex");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Check(str);
    }
}