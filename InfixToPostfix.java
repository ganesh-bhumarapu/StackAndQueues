import java.util.*;
class InfixToPostfix {
    static int precendence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    static String infixtoPostfix(String exp) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch != '+' && ch != '-' && ch != '*' && ch != '/' && ch != '^' && ch != '(' && ch != ')') {
                sb.append(ch);
            } else if (ch == '(') {
                sb.append(ch);
            } else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    char ele = st.pop();
                    sb.append(ele);
                }
                st.pop();
            }
            while (!st.isEmpty() && precendence(ch) <= precendence(st.peek())) {
                char ele = st.pop();
                sb.append(ele);
            }
            st.push(ch);
        }
        while (!st.isEmpty()) {// adding left over elements in the stack to the string
            char ele = st.pop();
            sb.append(ele);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();
        System.out.println(infixtoPostfix(exp));
    }
}