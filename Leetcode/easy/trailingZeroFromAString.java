public class Main {
    public static void main(String[] args) {
        System.out.println(removeTrailingZeros("900010"));
    }
    static String removeTrailingZeros(String num){
        char[] arr = num.toCharArray();
        int index = 0;
        for (int i = num.length() - 1 ; i >= 0 ; i--) {
            if(arr[i] != '0'){
                index = i;
                break;
            }
        }
        return num.substring(0, index + 1);
    }

}



//https://leetcode.com/problems/remove-trailing-zeros-from-a-string/solutions/3572865/easy-java/