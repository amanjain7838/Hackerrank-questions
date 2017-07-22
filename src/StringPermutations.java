
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPermutations {
 public static int count=0;
  public static void main(String args[]) {
    String str = "cAda";
    permutation(str);
  }
 
  public static void permutation(String str) {
    permutation("", str);
  }
 
  private static void permutation(String prefix, String str) {
    int n = str.length();    
if (n == 0) {
    Pattern r = Pattern.compile(prefix);
    Matcher m = r.matcher("AbrAcadAbRa");
    while(m.find()) {
         count++;}
            System.out.println(count);}
    else {
      for (int i = 0; i < n; i++) {
        permutation(prefix + str.charAt(i), str.substring(0,i) + str.substring(i+1,n));
      }
    }
  }
}