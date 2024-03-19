//1- means knowing
//0-means not knowing
//to become a celebrity the coulmns should be 1 and rows be 0
import java.util.*;
class celebrity{
    int celebrity(int M[][], int n) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            st.push(i);
        }
        while (st.size() >= 2) {
            int a = st.pop();
            int b = st.pop();
            if (M[a][b] == 1) {
                st.push(b);
            } else {
                st.push(a);
            }
        }
        int pc = st.pop();
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (i != pc) {
                if (M[pc][i] == 1 || M[i][pc] == 0) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag == true) {
            return pc;
        }
        return -1;
    }
    }
}