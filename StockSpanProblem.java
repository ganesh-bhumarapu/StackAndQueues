import java.util.*;
class StockSpanProblem{
    static int[] solve(int[] price,int n){
        int[] res=new int[n];
        res[0]=1;
        Stack<Integer> IndexStack=new Stack<>();
        IndexStack.push(0);
        for(int i=1;i<n;i++){
            while(!IndexStack.isEmpty() && price[IndexStack.peek()]<=price[i]){
                IndexStack.pop();
            }
            if(IndexStack.isEmpty()){
                res[i]=i+1;
            }
            else{
                res[i]=i-IndexStack.peek();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] price=new int[n];
        for(int i=0;i<n;i++){
            price[i]=sc.nextInt();
        }
        int[] result=solve(price,n);
        for(int i=0;i<n;i++){
            System.out.println(result[i]+" ");
        }
    }
}