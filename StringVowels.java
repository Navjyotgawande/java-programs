package Programs.stringprograms;

public class StringVowels {
    public static void main(String[] args) {
        String str = "This is a really simple sentence";
       str = str.toLowerCase();
        System.out.println(str.length());
             int Vcount =0;
             int constCount =0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                Vcount =Vcount +1;
            }else if(str.charAt(i) >= 'a' && str.charAt(i) <='z') {
                constCount = constCount + 1;
            }

        }

        System.out.println(Vcount);
        System.out.println(constCount);
    }
}
