package Task1;
import java.util.Scanner;



    class  InvalidReplcamentException extends Exception{
        public InvalidReplcamentException(String v){
            super(v);
            System.out.println(v);
        }
    }
    public class SubTask4 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("enter the string");
            String s = sc.next();
            System.out.println("Enter the replacement string");
            String replace = sc.next();
            String reg = "([0-9][A-Z])*$";
            if (replace.matches(reg)){
                System.out.println("valid string");
            }
            else {
                try{
                    throw  new InvalidReplcamentException(replace);
                }
                catch (Exception e){
                    System.out.println(e);
                }
            }
        }
    }
