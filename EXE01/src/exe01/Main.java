package exe01;

import java.util.Scanner;
/**
 *
 * @author Rubens Filipe
 */
public class Main {

    public static void main(String[] args) {
        
        int day;
        int month;
        int yearBirth;
        int result;
        int year = 2021;
        int totalYear;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe em que ano você nasceu: ");
        yearBirth = scan.nextInt();
        scan.nextLine();
        System.out.println("Informe em que mês você nasceu: ");
        month = scan.nextInt();
        scan.nextLine();
        System.out.println("Informe em que dia você nasceu: ");
        day = scan.nextInt();
        scan.nextLine();
        scan.close();
        
        totalYear = year - yearBirth;
        
        result = day + (yearBirth * 365) + (month * 30);
        System.out.println("Sua idade em dias é: " + result + " dias");
        System.out.println("Você tem " + totalYear + " anos, é do mês " + month + " e " + result + " dias.");
        //728.229
        
    }
    
}
