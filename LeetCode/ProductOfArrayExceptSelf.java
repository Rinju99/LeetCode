public class ProductOfArrayExceptSelf{
  public static void main(String[] args) {
    int[] arr = new int[]{1,2,3,4,5};
    int[] ans = product(arr);
    for(int i=0;i<ans.length;i++){
      System.out.println(ans[i]);;
    }
  }
  public static int[] product(int[] nums){
    int[] result = new int[nums.length];
    int product = 1;
    for(int i=0;i<nums.length;i++){
      result[i] =product;
      product*=nums[i];
    }
    product=1;
    for(int i=nums.length-1;i>=0;i--){
      result[i] *=product;
      product*=nums[i];
    }
    return result;
  }
}