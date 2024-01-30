package STACK;

import java.util.*;

public class ReverseString {
  // Reverse String using Stack
  // approach --> easy hai bro
  // String ---> "abcdefg" , simply traverse each character and push it into the
  // stack and than pop karao till stack becomes empty and add into the string

  // Approach 1 --> using simple loop
  public static String reverse(String s) {
    String reverseStr = "";
    StringBuilder sb = new StringBuilder("");// for saving more time
    Stack<Character> st = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      st.push(ch);
    }
    while (!st.isEmpty()) {
      char top = st.pop();
      sb.append(top);
    }
    reverseStr = sb.toString();
    System.out.println(reverseStr);
    return reverseStr;
  }

  // using RECURSION
  // thought process --> mujhe string ke har ek character ko travel krna hai and
  // usko push krna hai into the stack, so main ek idx ptr kr help se iterate
  // karunga over each character and jab hum uss iteration ko khatam kar denge (we
  // reach at the length of length string , than woh hamara base case hai and now
  // we have to backtrack) and during backtracking hum ye karenge ki jab stack se
  // element ko pop karate jaayenge and we'll keep on appending in the string
  // I hope so recursive thought process clear hoga, so let us code now
  // APPROACH - 2
  public static String reverseRec(String s, int idx, Stack<Character> st) {
    // base case
    if (idx == s.length()) {
      return "";
    }
    // extracting the character and pushing into the stack
    char ch = s.charAt(idx);
    st.push(ch);
    String fans = "";
    fans = reverseRec(s, idx + 1, st);// making next recursive call
    char stChar = st.pop();
    fans += stChar;// appending into fans string variable
    return fans;
  }

  public static void main(String[] args) {
    String fans = reverse("abcdefgh");
    String fans2 = reverseRec("abcdefgh", 0, new Stack<>());
    System.out.println("Reversed String is : " + fans2);
  }
}
