//napisz program ktory sprawdzi parowanie nawiasow
// np. 2*(3.4 -(-7)/2)*(a-2)/(b-1)))
import java.util.Scanner;

public class Lab_4_Zad_5 {
    public static void main(String[] arg){
        
        Scanner scan = new Scanner(System.in);
        StringBuffer text = new StringBuffer(scan.nextLine());
        scan.close();

        int count1=0;
        int count2=0;
        char lastChar;
        char bracket1='(';
        char bracket2=')';
    
        for(int i=0;i<text.length();i++){
            lastChar=text.charAt(i);
            if(lastChar==bracket1){
                count1++;
            }     
            if(lastChar==bracket2){
                count2++;
            }                  
        }

        if(count1==count2){
            System.out.println("OK");
        }
        else {
            System.out.println("Bledne sparowanie nawiasow");
        }
    }   
}
