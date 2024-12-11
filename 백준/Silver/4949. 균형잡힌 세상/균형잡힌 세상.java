import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      while (true) {
          String str = br.readLine();
          Stack<Character> sta = new Stack<>();

          if (str.equals("."))
              break;
          else {
              for (int i = 0; i < str.length(); i++) {
                  char ch = str.charAt(i);

                  switch(ch) {
                      case '(':
                          sta.push(ch);
                          break;
                      case '[':
                          sta.push(ch);
                      default:
                          if (ch == ')')
                              if ((!sta.isEmpty() && sta.peek() == '('))
                                  sta.pop();
                              else
                                  sta.push(ch);

                          else if (ch == ']')
                              if ((!sta.isEmpty() && sta.peek() == '['))
                                  sta.pop();
                              else
                                  sta.push(ch);
                          break;
                  }
              }

              if (sta.isEmpty())
                  System.out.println("yes");
              else
                  System.out.println("no");
          }
      }
    }
}
