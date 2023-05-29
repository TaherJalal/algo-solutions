public class Main {
    public static void main(String[] args) {
        System.out.println(indexOfTheLastWord("luffy is still joyboy"));
    }
    static int indexOfTheLastWord(String s){
        char[] arr = s.trim().toCharArray();
        int len = 0;

        for (int i = arr.length - 1; i >= 0 ; i--) {
            if(arr[i] == ' '){
                len = arr.length - i - 1;
                break;
            }
        }
        return len;
    }
}
