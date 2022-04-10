//Napisać program wczytujący ciąg znaków i liczący ilość liter a
import java.util.Scanner;

public class Lab_4_Zad_1 {
   public static void main(String[] arg){
    
    Scanner scan = new Scanner(System.in);
    StringBuffer text = new StringBuffer(scan.nextLine());
    scan.close();
    
    int count=0;
    char lastChar;
    char checkChar='a';

    for(int i=0;i<text.length();i++){
        lastChar=text.charAt(i);
        if(lastChar==checkChar){
            count++;
        }
    }
    System.out.println(count);
   } 
}
