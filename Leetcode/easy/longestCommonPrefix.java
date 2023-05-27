public class Main {
    public static void main(String[] args) {
        String[] arr = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(arr));
    }

    static String longestCommonPrefix(String[] strs){
        if(strs.length < 1) return "";
        String ans = strs[0];

        for (int i = 0; i < strs.length; i++) {
            for (int j = 1; j < Math.min(ans.length() , strs[i].length()); j++) {
                if(ans.charAt(j) != strs[i].charAt(j)){
                    ans = strs[i].substring(0 , j);
                }
            }
        }
        return ans;
    }

}
