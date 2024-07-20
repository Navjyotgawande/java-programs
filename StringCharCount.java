package Programs.stringprograms;

public class StringCharCount {
    public static void main(String[] args) {
        String bio = "Hello I am html developer";

        int count= 0;

        for (int i = 0; i < bio.length(); i++) {
            if (bio.charAt(i) != ' ') {
                count = count + 1;
            }

        }
        System.out.println("count " + count);
    }
}
