import java.util.*;
class validParanthese {
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x) {
        // add your code here
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == '(' || x.charAt(i) == '[' || x.charAt(i) == '{') {
                st.push(x.charAt(i));
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                char c = st.pop();// in if stmt check that c character should always be in closing state as we push the closing char to stack.
                if ((x.charAt(i) == ')' && c == '(') ||
                        (x.charAt(i) == ']' && c == '[') ||
                        (x.charAt(i) == '}' && c == '{')) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        if (st.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        System.out.println(ispar(x));
    }
}
