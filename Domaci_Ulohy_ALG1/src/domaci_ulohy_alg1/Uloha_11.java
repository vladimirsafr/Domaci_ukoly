
package domaci_ulohy_alg1;
import java.util.Scanner;

public class Uloha_11 {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int n = in.nextInt();
        
        double a,b,c,d;
        d = 0.065;
        c = 0.045;
        b = 0.15;
        a = n*t;
        System.out.println(a);
        a -= a*d+a*c+a*d;
        System.out.println(a);
    }
    
}
