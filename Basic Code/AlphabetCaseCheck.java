package BasicCode;
import java.util.*;
public class AlphabetCaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println(sc.next().trim());   //remove the extra spaces before the string

        /*String word = "hello";
        //charAt(0) -> means give me the character at this index of string
        System.out.println(word.charAt(0));*/

        char ch = sc.next().trim().charAt(0);
        if(ch >= 'a' && ch <='z'){
            System.out.println("Lowercase character");
        }
        else if(ch >= 'A' && ch <= 'Z'){
            System.out.println("Uppercase Character");
        }
        else{
            System.out.println("Not an Alphabet");
        }
    }
}
