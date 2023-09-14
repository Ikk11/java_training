import java.util.Scanner; // util.Scanner를 import 시켜야한다.
public class _06_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String z = sc.nextLine(); // String 한줄 불러오기 but 개행도 불러오기 때문에 첫째로 써야함
        int x = sc.nextInt(); // int값 불러오기
        String y = sc.next(); // String 한단어 불러오기
        long d = sc.nextLong(); // long 값 불러오기

    }
}
