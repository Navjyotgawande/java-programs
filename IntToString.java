package Programs.Conversions;

public class IntToString {
    public static void main(String[] args) {

        int i =10 ;

        String s  = String.valueOf(i); //Now it will return "10"
        System.out.println(s); // it will convert int to string

        System.out.println(i + s); // 20 as it is binary + operator will add both
        System.out.println(s + 100); // it will concatenate 100100

       System.out.println("<------------------------------>");

       String s2 = Integer.toString(i); // //Now it will return "10"
       System.out.println(s2);
    }
}
