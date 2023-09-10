import java.sql.SQLOutput;

public class _03_GCD_LCM {

    // 최대공약수 첫번째 방법 : (유클리드 호제법) 나머지의 최대공약수와 같다.
    public static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b); // 나머지가 0이될때까지 돌리면 최대공약수 구할수있음
    }

    // 최소공배수 두수의 곱을 두수의 최대공약수로 나눔
    public static int lcm(int a1, int a2) {
        return (a1 * a2) / gcd(a1, a2);
    }


    public static void main(String[] args) {
        System.out.println(gcd(10,5)); // 5
        System.out.println(gcd(18, 12)); // 6

        System.out.println(lcm(10,5)); // 10*5/5 = 10
        System.out.println(lcm(18,12)); // 18*12/6 = 36


        System.out.println("------------------------");


        int x = 22;
        int y = 12;

        // 최대공약수 2번째 방법 : x%y가 0이 될때 x의 값이 최대공약수가 된다.
        while (y != 0) {
            int tmp = x%y;
            x = y;
            y = tmp;
        }
        System.out.println(x);
    }
}
