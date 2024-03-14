import java.util.*;

class NextGreaterElement {
    static long[] nextLargerElement(long[] arr, int n) {
        long[] a = new long[n];
        Stack<Long> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {// start from the end of the array
            while (!st.isEmpty() && st.peek() <= arr[i]) {// check if stack is not empty and remove the elements in the stack which are lesser than the arr[i]
                st.pop();
            }
            if (!st.isEmpty()) {
                a[i] = st.peek();// if stack is not empty then assingn the top most value to the resultant array.it mean there is a element greater than the current element on its right side.
            } else {
                a[i] = -1;// if stack is empty then it mean that there is no element greater than the current element on its right side.
            }
            st.push(arr[i]);// after excuting all we have to push the given current array element on to the stack
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        long[] result = nextLargerElement(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
