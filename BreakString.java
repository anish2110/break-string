import java.io.*;
import java.util.*;

public class BreakString{
    static String word = "";
    
    public static void main(String [] ak) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        a = a+"?";
        
        ArrayList<String> al = new ArrayList<String>();

        String alpha = "!?,._' @+";
        char []arr = alpha.toCharArray();

        char[]sarr = a.toCharArray();
        
        outer:
        for(int i=0; i<sarr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(Character.valueOf(sarr[i]) == Character.valueOf(arr[j])){
                    if(word == "") continue outer;
                    al.add(word);
                    word = "";
                    continue outer;
                }
                else {
                    continue;
                }
            }
            word += Character.valueOf(sarr[i]);
            
        }

        System.out.println("\n"+al.size());
        for(String ss : al) System.out.println(ss);
    }
}