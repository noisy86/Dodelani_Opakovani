import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c = 'a'; c<='z';c++){
            map.put(c,0);
        }
        Scanner str = new Scanner(System.in);
        System.out.println("Enter String: ");
        String myStr = str.nextLine();
        for (int i = 0; i < myStr.length(); i++) {
            char myChar = Character.toLowerCase(myStr.charAt(i));

            if (Character.isWhitespace(myStr.charAt(i)) == false ){
                int k = (Integer) map.get(myChar);
                map.put(myStr.charAt(i), k+=1 );
            }
        }
        System.out.println(map);
    }
}
