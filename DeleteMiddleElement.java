import java.util.*;
class DeleteMiddleElement{
    public void deleteMid(Stack<Integer> s,int sizeOfStack){
        deleteMid(s,sizeOfStack,0);
    }
    public void deleteMid(Stack<Integer>s,int sizeOfStack,int cur){
        if(s.isEmpty() || cur==sizeOfStack /2){
            s.pop();
            return ;
        }
        int x=s.pop();
        deleteMid(s,sizeOfStack,cur+1);
        s.push(x);
    }
}
