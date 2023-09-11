public class _04_StringReverse {
    public static void main(String[] args) {
        // 계속 추가됨


        String n = "ABCDEFG";

        // charAt과 for문을 이용해서 뒤집기.
        String rev = "";
        for (int i = n.length()-1; i >= 0; i--) {
            rev += n.charAt(i);
        }
        System.out.println(rev); // GFEDCBA
        rev = "";

        // for문을 다르게 사용
        for (int i = 0; i < n.length(); i++) {
            rev += n.charAt(n.length()-1-i);
        }
        System.out.println(rev); // GFEDCBA
        rev = "";


        // split을 사용해 배열을 만들어 뒤집기
        String[] arr = n.split("");
        int x = arr.length;
        for (int i = 0; i < x; i++, x--) {
            String tmp = arr[i];
            arr[i] = arr[x-1];
            arr[x-1] = tmp;
        }
        for (int i = 0; i < arr.length; i++) {
            rev += arr[i];
        }
        System.out.println(rev); // GFEDCBA
        rev = "";
    }
}
