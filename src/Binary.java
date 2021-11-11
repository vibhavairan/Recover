import java.util.ArrayList;

public class Binary {
    ArrayList<String> NBitBinary(int N) {
        ArrayList<String> list = new ArrayList<>() ;
        solve("",0,0, N, list);
        return list;
    }

    void solve(String op,int one,int zero,int N, ArrayList<String> list){
        if(N==0) {
            list.add(op);
            return;
        }
        String op1=op+'1';
        solve(op1,one+1,zero,N-1,list);
        if(one>zero){
            String op2 = op+'0';
            solve(op2,one,zero+1,N-1,list);
        }
    }

}
