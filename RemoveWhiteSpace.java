package Programs.stringprograms;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String str = "Remove white spaces";
       String newStr = "";
        str = str.replaceAll("\\s+" , "");
        System.out.println(str);

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' '){
                newStr = newStr + str.charAt(i);
            }
        }
        System.out.println(str);
    }
}
