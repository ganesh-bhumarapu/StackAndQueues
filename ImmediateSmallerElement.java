import java.util.*;
class ImmediateSmallerElement{
    static void immediateSmaller(int arr[], int n) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n-1;i++){
            st.push(arr[i]);
            st.push(arr[i+1]);
            int a=st.pop();
            int b=st.pop();
            if(a<b){
                arr[i]=a;
            }else{
                arr[i]=-1;
            }
            st.push(a);
        }
        arr[n-1]=-1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(immediateSmaller(arr,n));
    }
}