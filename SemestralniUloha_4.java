
package semestralniulohy;

import java.util.Arrays;
import java.util.Scanner;


public class SemestralniUloha_4 {
    public static void semestralniUloha4 () {
        Scanner in = new Scanner(System.in);
        boolean cycle = true; 
        
        System.out.println("chcete spustit program a/n?");
        while (cycle){
            int[] arr1 = new int[2];
            int[] arr2 = new int[2];
            int[] arr3 = new int[2];
            int index = 0;
            
            boolean cycle1 = true;
            String answer = in.next();
            if (answer.equals("a")){
                System.out.println("zadejte prvni posloupnost: ");
                for (int i = 0;cycle1; i++) {
                    int n = in.nextInt();
                    if (n>0){
                        arr1 = lengthCheck(arr1, index++, n);
                    } else cycle1 = false;
                }
                
                System.out.println("zadejte druhou posloupnost: ");
                cycle1 = true;
                index = 0;
                for (int i = 0;cycle1; i++) {
                    int n = in.nextInt();
                    if (n>0){
                        arr2 = lengthCheck(arr2, index++, n);
                    } else cycle1 = false;
                    
                    
                }
                System.out.println("zadejte treti posloupnost: ");
                cycle1 = true;
                index = 0;
                for (int i = 0;cycle1; i++) {
                    int n = in.nextInt();
                    if (n>0){
                        arr3 = lengthCheck(arr3, index++, n);
                    } else cycle1 = false;
                }
                
                conectionArrays(arr1,arr2,arr3);
                
            } else if (answer.equals("n")) {
                cycle = false;
            } else System.out.println("pokracovat ve zpracovani (a/n)");
        }
    }

    private static int[] lengthCheck(int[] orginal, int index, int value) {
        if (orginal.length - 1 == index) {
            int[] newArray = new int[orginal.length + 1];
            System.arraycopy(orginal, 0, newArray, 0, orginal.length);
            newArray[index] = value;
            return newArray;
        } else {
            orginal[index] = value;
            return orginal;
        }
    }
    public static void conectionArrays (int [] arr1,int arr2[],int arr3[]){
        int [] finalArray = new int [arr1.length+arr2.length+arr3.length+1];
        int count = 1;
        for (int i = 0;i<arr1.length;i++){
            finalArray[i]=arr1[i];
            count++;
        }
        for (int i = 0;i<arr2.length;i++){
            finalArray[count]=arr2[i];
            count++;
        }
        for (int i = 0;i<arr3.length;i++){
            finalArray[count]=arr3[i];
            count++;
        }
        Arrays.sort(finalArray);
        for (int i = 0;i<finalArray.length;i++){
            if (finalArray[i]!=0){
                System.out.print(finalArray[i]+" ");
            }
        }
        System.out.println("\npokracovat ve zpracovani (a/n)");
    }
    
}
