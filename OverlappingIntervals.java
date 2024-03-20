import java.util.*;
class OverlappingIntervals{
    static int[][] overlappedInterval(int[][] intervals){
        Arrays.sort(intervals,Comparator.comparingInt(a -> a[0]));
        Stack<int[]> st=new Stack<>();
        st.push(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            int[] currentInterval=intervals[i];
            int[] topInterval=st.peek();
            if(currentInterval[0]<=topInterval[1]){
                topInterval[1]=Math.max(currentInterval[1],topInterval[1]);
            }else{
                st.push(currentInterval);
            }
        }
        int[][] merged=new int[st.size()][2];
        for(int i=merged.length-1;i>=0;i--){
            merged[i]=st.pop();
        }
        return merged;
    }
}