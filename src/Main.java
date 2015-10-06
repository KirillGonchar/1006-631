/**
 * Created by kirill on 10/6/2015
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int m = 3430;
        int n = 1130;
        int m1 = Math.abs(10 - m);
        int n1 = Math.abs(10 - n);

        if (m1 <= n1){
        System.out.println(m);}
        else {
            System.out.println(n);
        }

    }
}
