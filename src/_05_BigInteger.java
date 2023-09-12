import java.math.BigInteger;

public class _05_BigInteger {
    public static void main(String[] args) {

        // java.math.BigInteger; 로 import 시켜줘야함.

        BigInteger x = new BigInteger("100000000000000000000");
        BigInteger y = new BigInteger("200000000000000000000");
        System.out.println(x); // 100000000000000000000
        System.out.println(y); // 200000000000000000000


        System.out.println("--------------------");

        // int long -> String 으로 변환시켜서 BigInteger로 만들수 있음.
        int x1 = 1000;
        long y1 = 100000000000000L;
        String z1 = "1000000";
        BigInteger x2 = new BigInteger(Integer.toString(x1));
        BigInteger y2 = new BigInteger(Long.toString(y1));
        BigInteger z2 = new BigInteger(z1);
        System.out.println(x2);
        System.out.println(y2);
        System.out.println(z2);


        // 계산. int나 long 과는 계산불가
        x = x.add(y);
        System.out.println(x); // 덧셈
        x = x.subtract(y);
        System.out.println(x); // 뺄셈
        x = y.divide(x);
        System.out.println(x); // 나눗셈
        x2 = x2.multiply(z2);
        System.out.println(x2); // 곱셈
        z2 = z2.remainder(x2);
        System.out.println(z2); // 나머지


    }

}
