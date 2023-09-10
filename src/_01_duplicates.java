import java.util.ArrayList;
public class _01_duplicates {
    public static void main(String[] args) {
        // 중복된 배열 삭제하기
        String[] arr = {"1","2","2","3","4","5","5","6"};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]); // 1 2 2 3 4 5 5 6
        }
        System.out.println();



        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {    // ArrayList 의 contains로 중복걸러냄
            if (!ans.contains(arr[i])) {
                ans.add(arr[i]);
            }
        }
        String[] answer = ans.toArray(new String[ans.size()]); // ArrayList.toArray
        for (int i = 0; i < answer.length; i++) {
            System.out.print(" " + answer[i]); // 1 2 3 4 5 6
        }

    }
}
