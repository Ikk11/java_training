import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class _08_ArrayList {
    public static void main(String[] args) {
        // 기본공간 10, 괄호에 크기 넣음
        ArrayList<String> s = new ArrayList<String>(); // String 타입 list 선언
        ArrayList<String> s1 = new ArrayList<>(20); // 뒤에 생략가능, 크기 20
        ArrayList<Integer> i = new ArrayList<Integer>(); // Integer 타입
        ArrayList<Integer> i1 = new ArrayList<>(30); // 뒤에 생략 가능, 크기 30

        System.out.println(s1.size()); // AllayList.size(); 리스트의 크기 0 (공간이 20이라도 없으면 0)

        // 값 추가 ArrayList.add(); (가장 마지막에 값 추가)
        s.add("b");
        s.add("c");
        s.add("d");
        i.add(1);
        i.add(3);
        i.add(4);
        i.add(5);

        System.out.println(s); // [a, b]
        System.out.println(i); // [1, 2]

        s.add(0,"a"); // ArrayList.add(index, 값); index 위치에 값 추가. replace 아님
        System.out.println(s); // [c, a, b] index 0위치 (처음위치) 에 "c" 추가됨
        i.add(1,2);
        System.out.println(i); // 두번째 위치에 3 추가

        // 값 삭제하기
        s.remove(3);
        System.out.println(s); // 4번째값 삭제
        s.remove("c");
        System.out.println(s); // c 삭제

        i.remove(4);
        System.out.println(i); // 5번째값 삭제
        i.remove(Integer.valueOf(4)); // or (Integer)4     // Integer.parseInt 는 안된다
        System.out.println(i); // 4 삭제

        s.clear();
        System.out.println(s); // 전체삭제
        i.clear();
        System.out.println(i);

        s.add("a");
        s.add("b");
        s.add("c");
        i.add(1);
        i.add(2);
        i.add(3);
        i.add(4);
        i1.add(1);
        i1.add(2);
        System.out.println(s);
        System.out.println(i);
        System.out.println(i1);

        i.removeAll(i1);
        System.out.println(i); // removeAll 안의 컬렉션을 받아 컬렉션이 포함하고있는걸 지움
        i.addAll(i1);
        System.out.println(i); // 끝에 i1을 추가함 [3,4,1,2]

        // 데이터 확인
        System.out.println(s.size());  // s.size();
        System.out.println(s.isEmpty()); // s.isEmpty(); false
        System.out.println(s1.isEmpty()); // true
        System.out.println(s.contains("a")); // 포함하면 true (int정렬에도 사용가능)*
        System.out.println(s.indexOf("a")); // "a" 의 위치, 없으면 -1 (int정렬에도 사용가능)*
        s.add("a");
        System.out.println(s.lastIndexOf("a")); // 마지막 "a"의 위치 3

        // sort 정렬
        System.out.println(s); // abca
        Collections.sort(s); // 오름차순 정렬
        System.out.println(s); //aabc
        s.sort(Comparator.naturalOrder()); // list.sort(); 를 사용한 오름차순 정렬
        s.sort(Comparator.reverseOrder()); // 내림차순 정렬
        System.out.println(s); // cbaa


        // set 변경
        s.set(0,"a"); // set(인덱스, 값) 인덱스위치의 값을 "a"로 변경
        System.out.println(s); // abaa
        i.set(0,1);  // 0번쨰 위치를 1로 변경
        System.out.println(i); // 3412 -> 1412

        // get 위치확인
        System.out.println(s.get(1)); // 2번째 위치인 b
        System.out.println(i.get(3)); // 4번쨰 위치인 2


        // Arrays.asList() 일반배열을 ArrayList로 변환  ***int는 Arrays.asList() 안먹힘
        String[] ss = {"a","b","c","d","e","f","g"};
        ArrayList<String> s2 = new ArrayList<>(Arrays.asList(ss));
        System.out.println(s2);
        s2.remove(0);
        System.out.println(s2);
        s2.remove(s2.size()-1);
        System.out.println(s2);



        // ArrayList -> String Array(배열)  String[] Array = Arraylist.toArray(new String[ArrayList.size()]);
        // int 로는 못바꿈!!!
        String[] sss = s2.toArray(new String[s2.size()]);

        // int 로 바꾸는법
        System.out.println(i1); // 1,2
        int[] iii = new int[i1.size()];
        for (int j = 0; j < iii.length; j++) {
            iii[j] = i1.get(j).intValue(); // ***.intValue() 로 Arraylist의 값을 int값으로 바꿔줘야한다.
        }


        // int배열 Arraylist로 변경하기
        int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
        ArrayList<Integer> arr = new ArrayList<>();
        for (int element : index_list) {
            arr.add(element);
        }
        System.out.println(arr);

        // 빈문자열과 null 제거할때 Allays.aslist 사용
        String[] ss11 = {"a","b","","","",null,null};
        ArrayList<String> ss111 = new ArrayList<>(Arrays.asList(ss11));
        System.out.println(ss111);
        ss111.removeAll(Arrays.asList("",null));
        System.out.println(ss111);
    }
}
