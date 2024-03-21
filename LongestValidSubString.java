import java.util.*;
class LongestValidSubString{
    static int solve(String s){
        int maxLen=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(i);
            }else{
                st.pop();
                if(!st.isEmpty()){
                    maxLen=Math.max(maxLen,i-st.peek());
                }else{
                    st.push(i);
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(solve(s));
    }
}