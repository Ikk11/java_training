public class _02_binary {
    public static void main(String[] args) {
        // Integer.parseInt(a) 문자열 a를 10진수로 변환
        // Integer.parseInt(a, 2) 문자열 a를 2진수로 읽어서 10진수로 변환 2대신 8 16진수도 가능
        int bin = Integer.parseInt("10", 2);
        int bin1 = Integer.parseInt("1110111011", 2);
        int bin2 = Integer.parseInt("1011011101", 2);
        System.out.println(bin); // 2
        System.out.println(bin1); // 955
        System.out.println(bin2); // 733

        // Integer.toString(a) int a를 문자열로 변환
        // Integer.toString(a, 2) int a 를 2진수로 바꾸어 문자열로 변환
        String bin0 = Integer.toString(bin, 2);
        String bin01 = Integer.toString(bin1, 2);
        String bin02 = Integer.toString(bin2, 2);
        System.out.println(bin0); // "10"
        System.out.println(bin01); // "1110111011"
        System.out.println(bin02); // "1011011101"
    }
}
