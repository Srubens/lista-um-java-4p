package exe02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        int eleitor;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe sua idade para verificar qual tipo de eleitor você se encaixa: ");
        eleitor = scan.nextInt();
        scan.nextLine();
        
        if( eleitor < 16 ){
            System.out.println(eleitor);
            System.out.println("Você ainda não é um eleitor.");
        }else if( eleitor >= 18 && eleitor < 65 ){
            System.out.println(eleitor);
            System.out.println("Você é obrigado.");
        }else if( eleitor == 16 || eleitor == 18 || eleitor > 65 ){
            System.out.println(eleitor);
            System.out.println("Você é facutativo");
        }
        
    }
    
}
