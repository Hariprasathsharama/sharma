
import java.math.BigInteger;
public class Biginteger {
    public static void main(String[] args) {
        BigInteger no=new BigInteger("1");
        BigInteger sum=new BigInteger("0");
        BigInteger two=new BigInteger("2");
        for (int i = 1; i <=64; i++) {
            no=no.multiply(two);
            sum=sum.add(no);
        }
      System.out.println(sum);
    }
}
