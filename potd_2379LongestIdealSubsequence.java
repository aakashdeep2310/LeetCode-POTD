import java.util.Arrays;

public class potd_2379LongestIdealSubsequence {

    // "acfgbd" and k=2 k should not be greater than 2, it should always less or equal to 2

    public static void main(String[] args) {
        String s = "acfgbd";
        int k = 2;
        int ans = longestidealString(s, k);
        System.out.println(ans);
        
    }

    public static int longestidealString(String s, int k){
        int n = s.length();
        int dp[][] = new int[n][27];

        //initialize dp with -1
        for(int i = 0; i<n; i++){
            Arrays.fill(dp[i], -1);
        }

        return getMaxLenSubSeq(s, k, 0, '{', dp);
    }
    public static int getMaxLenSubSeq(String s, int k, int index, char lastChar, int dp[][]){

        //base case
        if(index == s.length()){
            return 0;
        }

        // if state is already visited the return
        if(dp[index][lastChar - 'a'] != -1){
            return dp[index][lastChar - 'a'];
        }

        int pick = 0;
        char currentChar = s.charAt(index);
        int diff = Math.abs((int) lastChar - (int)currentChar);
        if(lastChar == '{' || diff<= k){
            pick = 1 + getMaxLenSubSeq(s, k, index + 1 , lastChar, dp); 
        }
        int noPick = 0 + getMaxLenSubSeq(s, k, index + 1, lastChar, dp); 

        return dp[index][lastChar - 'a'] =  Math.max(pick, noPick);
    }
    
}
