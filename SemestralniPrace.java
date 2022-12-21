
package semestralniulohy;

import java.util.Scanner;


public class SemestralniPrace {
    public static void main (String[]args) throws InterruptedException{
        Scanner in = new Scanner(System.in);
        boolean cycle = true;
        while (cycle){
            System.out.println("Vyberte ulohu: \n1.Semestralni uloha\n2.Vanocni uloha\n3.Exit ");
            int n = in.nextInt();
            switch (n){
                case 1:
                    SemestralniUloha4.codmain();
                    break;
                case 2:
                    VanocniUloha_.codmain();
                    break;
                case 3:
                    cycle = false;
                    break;
                default:
                    System.out.println("vyberte 1, 2 nebo 3");
            }
        }
        
    }
    
}
