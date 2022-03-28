package Assignment_11;

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)  throws FileNotFoundException,IOException{

        //reading
        Scanner TextFile = new Scanner(new File("input.txt"));

        Map<Character, Integer> charfrequency = new TreeMap<>();


        while(TextFile.hasNext()) {
            char[] inputString = TextFile.nextLine().toLowerCase().toCharArray();
            for (int i = 0; i < inputString.length; i++) {
                char key= inputString[i];
                if (charfrequency.containsKey(key)) {
                    int freq = charfrequency.get(key);
                    charfrequency.put(key, ++freq);
                } else {
                    charfrequency.put(key, 1);
                }

            }
        }
        //Printing
        FileWriter fw;
        fw = new FileWriter("output.txt");
        fw.write("{");
        Set<Character> keys  = charfrequency.keySet();
        for(Character i : keys)
        {
            fw.write(i+"="+charfrequency.get(i)+", ");

        }
        fw.write("}");

        fw.close();
        TextFile.close();

    }//end main
}
