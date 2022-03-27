package Assignment_1;

import java.io.File;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Assignment_1 {

    private static List<String> fileList;

    private static File file;
    private static final String anyChar = "[^\\s]*";

    public static void matchedFileNames(String pattern) {
        Pattern p = Pattern.compile(anyChar + pattern + anyChar, Pattern.CASE_INSENSITIVE);
        for (String name : fileList) {
            if (p.matcher(name).matches()) {//name.toLowerCase().contains(pattern)
                System.out.println(name);
                System.out.println("Path: " + file.getAbsolutePath() + "/" + name);
            }
        }

    }

    public static boolean hasMatchingFiles(String pattern) {
        Pattern p = Pattern.compile(anyChar + pattern + anyChar, Pattern.CASE_INSENSITIVE);
        for (String name : fileList) {
            if (p.matcher(name).matches()) {//name.toLowerCase().contains(pattern)
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pattern;
        file = new File("/home/yashig/");
        fileList = List.of(file.list());
        do {
            System.out.println("Enter File Name");
            pattern = sc.nextLine().toLowerCase().trim();
            if (hasMatchingFiles(pattern)) {
                System.out.println("Files with the pattern \"" + pattern + "\"");
                System.out.println("**************************************");
                matchedFileNames(pattern);
            } else {
                System.out.println("No files found");

            }

            System.out.println("continue : y/n");

        } while (sc.nextLine().charAt(0) == 'y');
    }
}

