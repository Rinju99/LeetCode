
/*You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

*/
public class ClimbingStairs {
  public static void main(String[] args) {
    System.out.println(climbStrairs(5));
  }
  public static int climbStrairs( int n) {

    if(n<=2) {
      return n;
    }
    int n1=1,
        n2 = 2;
    for(int i=3; i<n;i++){
      int n0 = n1+n2;
      n1= n2;
      n2 = n0;
    }
    return n1+n2;
  }
}


/* Dynamic solution below...

if(n<2) return n;
    int[] dp = new int[n+1];
    dp[1] = 1;
    dp[2] = 2;

    for(int i=3;i<dp.length;i++){
      dp[i] = dp[i-1] + dp[i-2];
    }
    return dp[n];
  }
*/