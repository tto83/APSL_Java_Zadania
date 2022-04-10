//sprawdza czy palindrom

import java.util.Scanner;
public class Lab_4_Zad_3 {
    public static void main(String[] arg){
    
        Scanner scan = new Scanner(System.in);
        StringBuffer text = new StringBuffer(scan.nextLine());
        scan.close();
        
        if(text.toString().toLowerCase().equals(text.reverse().toString().toLowerCase())){
            System.out.println("To jest palindrom");
        }
        else{
            System.out.println("To nie jest palindrom");
        }
    }
}
