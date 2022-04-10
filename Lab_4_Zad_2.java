//odwraca ciąg znaków

import java.util.Scanner;
public class Lab_4_Zad_2 {
    public static void main(String[] arg){
    
        Scanner scan = new Scanner(System.in);
        StringBuffer text = new StringBuffer(scan.nextLine());
        scan.close();
        
        System.out.println(text.reverse());
    }
}
