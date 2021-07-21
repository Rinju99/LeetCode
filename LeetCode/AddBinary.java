//Given two binary strings a and b, return their sum as a binary string.

public class AddBinary {
  public static void main(String[] args) {
    String a = "1010";
    String b ="1011";

    System.out.println(addBinary(a, b));

  }
  public static String addBinary(String a, String b){
    StringBuffer sb = new StringBuffer();
    int x=a.length()-1,
        y = b.length()-1;
    int carry =0;
    while(x>=0 || y>=0){
      int sum=carry;
      if(x>=0){
        sum +=a.charAt(x--)-'0';
      }
      if(y>=0){
        sum+=b.charAt(y--)-'0';
      }

      sb.insert(0, sum%2);
      carry = sum/2;
    }
    if(carry>0){
      sb.insert(0, 1);
    }
    return sb.toString();
  }
}
