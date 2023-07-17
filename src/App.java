import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        String str1;
        String str2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text : ");
        str1 = sc.nextLine();
        System.out.print("Input text : ");
        str2 = sc.nextLine();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        // check if length is same
        if(str1.length() == str2.length()) {
    
          // convert strings to char array
          char[] charArray1 = str1.toCharArray();
          char[] charArray2 = str2.toCharArray();
    
          // sort the char array
          Arrays.sort(charArray1);
          Arrays.sort(charArray2);
    
          // if sorted char arrays are same
          // then the string is anagram
          boolean result = Arrays.equals(charArray1, charArray2);
    
          if(result) {
            System.out.println(str1 + " and " + str2 + " are anagram.");
          }
          else {
            System.out.println(str1 + " and " + str2 + " are not anagram.");
          }
        } else {
          System.out.println(str1 + " and " + str2 + " are not anagram.");
        }
    }
}
