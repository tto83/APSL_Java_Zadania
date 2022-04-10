//Napisac program, ktory sumuje cyfry zawarte w tekscie
import java.util.Scanner;

public class Lab_4_Zad_4 {
    public static void main(String[] arg){

        Scanner scan = new Scanner(System.in);
        StringBuffer text = new StringBuffer(scan.nextLine());
        scan.close();

        int count=0;
        int temp;

        for(int i=0;i<text.length();i++){
            if(Character.isDigit(text.charAt(i))) {
                temp = Character.getNumericValue(text.charAt(i));
                count+=temp;
            }
        }
        System.out.println(count);
    }
}
