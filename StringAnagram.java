package Programs.stringprograms;

import java.util.Arrays;

public class StringAnagram {
    public static void main(String[] args) {
        String str= "aBc";
        String str2 = "Cba";

        //converted to lower case
        str = str.toLowerCase();
       str2 = str2.toLowerCase();

        if(str.length() != str2.length()){
            System.out.println("Given string is not anagram");

        }
        else {

           // convert both array into char array

            char[]string1 = str.toCharArray();
            char[]string2 = str2.toCharArray();
            Arrays.sort(string1);
            Arrays.sort(string2);

//            check for equality

            if(Arrays.equals(string1 , string2) == true){
                System.out.println("Given string is anagram");
            }else {
                System.out.println("Given string is not anagram");
            }
        }



    }
}
