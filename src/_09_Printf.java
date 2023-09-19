public class _09_Printf {
    public static void main(String[] args) {
        int x = 10;
        double y = 10.0;
        String z = "십";
                            // int는 %d, double은 %f, String은 %s, 마지막엔 \n으로 개행해준다.
        System.out.printf("인트값 : %d, 더블값 : %f, 스트링값 : %s\n", x, y, z);
    }
}
