package Assignment_2;

import java.util.Scanner;

public class Assignment_2 {
    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter your String ");
        str =in.nextLine();
        str = str.toLowerCase();
        boolean[] alphaList = new boolean[26];
        int index = 0;
        int flag = 1;
        for (int i = 0; i < str.length(); i++) {
            if( str.charAt(i) >= 'a' &&  str.charAt(i) <= 'z') {
                index = str.charAt(i) - 'a';
            }
            alphaList[index] = true;
        }
        for (int i = 0; i <= 25; i++) {
            if (alphaList[i] == false)
                flag = 0;
        }
        System.out.print("String: " + str);
        if (flag == 1)
            System.out.print("\nHas all letters\n ");
        else
            System.out.print("\nDoes not contain all letters\n ");
    }
}
