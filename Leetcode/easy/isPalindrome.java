import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        System.out.println(isPalindrome(121));
    }

    static Boolean isPalindrome(int n){
        String nStringified = String.valueOf(n);

        String reversed = new StringBuilder(String.join(""  , Arrays.asList(nStringified.split("")))).reverse().toString();

        if(nStringified.equals(reversed)){
            return true;
        }
        else {
            return false;
        }
    }

    // easier attempt
    //    static boolean isPalindrome(String str) {
//        String s = "";
//        for (int i = str.length() - 1; i >= 0; i--) {
//            s += str.charAt(i);
//        }
//        System.out.println(s);
//        return str.equals(s);
//    }

}
