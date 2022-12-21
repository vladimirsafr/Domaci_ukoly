

package semestralniulohy;

import java.util.Scanner;


public class VanocniUloha_ {
    public static void codmain ( ) throws InterruptedException {
        
        Scanner in = new Scanner (System.in);
        System.out.println("zadejte y:");
        double y = in.nextDouble();
        System.out.println("zadejte x:");
        double x = in.nextDouble();
        double resolution = y*3;
        if (resolution!=x){
            x = resolution;
        }
        
        System.out.println(ConsoleColor.BLACK + ConsoleColor.BLACK_BACKGROUND + " " + ConsoleColor.RESET);
        
        while (true){
            drawsnowman(y,x);
            spaceFrame(y,x);
        }
    }
    public static void drawsnowman (double a,double b){
        double r = (double)((3*(a+b))/96);
        double r1 = (double)((2.5*(a+b))/96);
        double r2 = (double)((1.5*(a+b))/96);
        double r3 = (double)((0.25*(a+b))/96);
        double y = a;
        double x = b;
        double a1 = (double)y/(1.3);
        double a2 = (double)a1-2.6*r1;
        double a3 = (double)a2-3.8*r2;
        double a4 = (double)a3-r3*3;
        double b1 = (double)x/2;
        for (double i=0;i<=a;i++){
            for (double j=0;j<=b;j++){
                double firstEllipse = (double)(Math.pow(i-(a1), 2)/2)+((Math.pow(j-(b1), 2))*11.0/24.0)/9;
                double secondEllipse = (double)(Math.pow(i-(a2), 2)/2)+(Math.pow(j-(b1), 2)*11.0/24.0)/9;
                double thirdEllipse = (double)(Math.pow(i-(a3), 2)/2)+(Math.pow(j-(b1), 2)*11.0/24.0)/9;
                double eyeOne = (double)(Math.pow(i-(a4), 2)/4)+(Math.pow(j-(b1-(r3*10)*11.0/24.0), 2))/12;
                double eyeTwo = (double)(Math.pow(i-(a4), 2)/4)+(Math.pow(j-(b1+(r3*10)*11.0/24.0), 2))/12;
                int R = (int)(Math.random()*(50+1)) +1;

                if (i==0 || i==a){
                    System.out.print(ConsoleColor.RED + ConsoleColor.PURPLE_BACKGROUND + "=" + ConsoleColor.RESET);
                } else if (j==0 || j==b){
                    System.out.print(ConsoleColor.RED + ConsoleColor.PURPLE_BACKGROUND + "|" + ConsoleColor.RESET);
                } else if (j>=(x/2)-2 && j<=(x/2)+2 && i<=y-(r*2+r1*2+r2*6+1) && i>=y-(r*2+r1*2+r2*6+3)) {
                    System.out.print(ConsoleColor.GREEN + ConsoleColor.GREEN_BACKGROUND +"|" + ConsoleColor.RESET);
                } else if (j>=(x/2)-2 && j<=(x/2)+2 && i<=y-(r*2+r1*2+r2*6) && i>=y-(r*2+r1*2+r2*6+4)){
                    System.out.print(ConsoleColor.RED + ConsoleColor.RED_BACKGROUND + "-" + ConsoleColor.RESET);
                } else if (r3*r3>=eyeOne || r3*r3>=eyeTwo) {
                    System.out.print(ConsoleColor.WHITE + ConsoleColor.RED_BACKGROUND + "0" + ConsoleColor.RESET);
                } else if (r2*r2>=thirdEllipse){
                    System.out.print(ConsoleColor.WHITE + ConsoleColor.BLUE_BACKGROUND + "@" + ConsoleColor.RESET);
                } else if (r1*r1>=secondEllipse){
                    System.out.print(ConsoleColor.WHITE + ConsoleColor.BLUE_BACKGROUND + "@" + ConsoleColor.RESET);
                } else if (r*r>=firstEllipse){
                    System.out.print(ConsoleColor.WHITE + ConsoleColor.BLUE_BACKGROUND + "@" + ConsoleColor.RESET);
                } else {
                    if (R==1 || R==2){
                    System.out.print(ConsoleColor.BLUE + ConsoleColor.BLUE_BACKGROUND + "+" + ConsoleColor.RESET);
                } else System.out.print(ConsoleColor.BLUE + ConsoleColor.BLUE_BACKGROUND + " " + ConsoleColor.RESET);
                }
            }
            System.out.println();
        }
    }
    public static void spaceFrame (double a,double b) throws InterruptedException {
        Thread.sleep(550);
        for(int i=0;i<=a+20;i++){
            for (int j=0;j<=b;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        
    }
}
