package Task2;

import java.util.*;
import java.util.stream.Collectors;

class getlist {
    static List<Integer> getList(String s) {
        String string[] = s.split(";");
        List<Integer> v = new ArrayList<>(20);

        for (int j = 0; j < string.length; j++) {
            v.add(Integer.parseInt(string[j]));

        }
        return v;

    }
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the few numbers separated by ; (for e.g 1;2;3;4)");
        String s = sc.next();
        List<Integer> ss = getList(s);
        System.out.println("list:"+ss);

    }
}