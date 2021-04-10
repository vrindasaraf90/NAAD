package Task2;
import java.util.Scanner;
import java.util.*;

public class SubTask3 {
    public static void main(String[] args) {
        startGame("SHAMBHO");}

    private static <AbstractStringBuilder> void startGame(String s) {

        int c = 3;
        int flag = 0;
        String tempShowString = s;
        StringBuilder showString = new StringBuilder();
        char s1[] = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (s1[i] != 'A' && s1[i] != 'E' && s1[i] != 'I' && s1[i] != 'O' && s1[i] != 'U') {
                s1[i] = '_';
                c++;
            }
        }
        while(c!=0 && !tempShowString.equals(showString.toString()))
        for (int i = 0; i < c; c--) {
            flag = 0;
            System.out.print("WORD :");
            for (int j = 0; j < s.length(); j++) {
                System.out.print(s1[j]);
            }
            System.out.println();
            System.out.println("CHANCES :" + c);
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the guess=");
            char input = sc.next().charAt(0);
            HashMap<Character, Integer> positionOfCharacter = new HashMap<>();
            if (!positionOfCharacter.containsKey(input)) {
                System.out.println("Character not found. Try Again");
            }
            else{
                System.out.println("Character found");
                for(i = 0; i<s.length(); i++)
                {

                    if(s.charAt(i) == input)
                        showString.setCharAt(i,input);

                }
            }
            c--;
            }
        if(c == 0 && !tempShowString.equals(showString.toString()))
            System.out.println("BETTER LUCK NEXT TIME");
        else System.out.println("YOU WON");

        }

    }
