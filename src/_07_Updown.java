import java.util.Scanner;
public class _07_Updown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = (int)(Math.random()*100); // 랜덤 1~100의 값을 불러옴
        int z = x;
        int x1 = 0;
        while (true) {
            System.out.print("숫자를 입력하세요 :");
            int y = sc.nextInt();
            if (y >= 100 || y <= 1) {
                System.out.println("1에서 100사이의 수를 입력해주세요");
                x1++;
                continue;
            } else if (y > z) {
                System.out.print("Down");
                x1++;
            } else if (y < z) {
                System.out.print("Up");
                x1++;
            } else if (y == z) {
                System.out.println("Right");
                System.out.println(x1);
                break;
            }
        }
    }
}
