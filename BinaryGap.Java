// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        int finalGap = 0;
        if (N == 1) {
            return 0;
        }
    
        char binaryRep[] = Integer.toBinaryString(N).toCharArray();
        int tempGap=0; 
        for (int x = 0; x < binaryRep.length; x++) {
            if(binaryRep[x]=='0'){
                tempGap++;
                continue;
            }else if(binaryRep[x]=='1'){
                if(tempGap>finalGap)
                finalGap=tempGap;
                tempGap=0;
            }
            
        }
        return finalGap;
    }
}