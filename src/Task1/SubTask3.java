package Task1;

public class SubTask3 {
    public static void main(String[] args) {
        System.out.println(isDirectlyProportional(new int[] {1,2,3,4}, new int[] {20,25,30,35}));
    }

    private static boolean isDirectlyProportional(int[] x, int[] y) {
        boolean statement = true;
        double d= y[0]/x[0];
        for(int i=0 ; i<x.length ; i++){
            if ((y[i]/x[i])!=d){
                statement = false;
            }
        }
        return statement;
    }
}
