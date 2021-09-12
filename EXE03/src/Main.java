
public class Main {

    public static void main(String[] args) {
        int i = 0;
        int a = 0;
        int cont = 10;
        
        while( i  < 10 ){
            i++;
            System.out.println(i);
        }
        System.out.println("------------");
        do{
            a++;
            if(a == 5){
                System.out.println(a);
                break;
            }
            System.out.println(a);
        }while(a < 10);
        System.out.println("------------");
        while(cont > 0){
            System.out.println(cont);
            cont--;
            
        }
        System.out.println("------------");
        for( int contagem = 0; contagem < 10; contagem++ ){
            System.out.println("contagem " + contagem);
        }
        System.out.println("------------");
        for( int contagem = 10; contagem > 0; contagem-- ){
            System.out.println("contagem " + contagem);
        }
        
        
        
    }
    
}
