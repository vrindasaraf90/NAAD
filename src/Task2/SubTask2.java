package Task2;
import java.util.HashMap;

public class SubTask2 {

        public static void main(String[] args) {
            System.out.println((sub("1;2;2;2;3;1")));
        }

        static HashMap<Integer, Integer> sub(String s) {
            String[] str = s.split(";");
            HashMap<Integer, Integer> hmap = new HashMap<>();
            Integer[] integer = new Integer[str.length];
            for (int i = 0; i < str.length; i++) {
                integer[i] = Integer.parseInt(str[i]);

                if (hmap.containsKey(integer[i])) {
                    hmap.put(integer[i], hmap.get(integer[i] + 1));
                } else {
                    hmap.put(integer[i],1);
                }

            }
            return hmap;
        }
    }

