public class ComparisonOperatorInString {
    public static void main(String[] args) {
        String s1="hello";
        String s2="HELLO";
        String s3=s1.toUpperCase();
        System.out.println(s3);
        String s4=s2.toLowerCase();
        System.out.println(s4);
        System.out.println(s1.equalsIgnoreCase(s2));

        
    }

}
