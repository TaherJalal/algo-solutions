import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String args []){
        System.out.println(toCamelCase("to-camel-case "));
    }
    static String toCamelCase(String name){
        if (name.contains("-") || name.contains("_")){
            ArrayList<String> nameArr = new ArrayList(Arrays.asList(name.split("")));

            for (int i = 0; i < nameArr.size(); i++) {
                if (nameArr.get(i).equals("-") || nameArr.get(i).equals("_")){
                    nameArr.remove(i);
                    nameArr.set(i , nameArr.get(i).toUpperCase());
                    //if the string has more than 1 - or _ u need to decrement i
                    i--;
                }
            }
            return String.join("" , nameArr);
        }
        else {
            return name;
        }

    }
}
