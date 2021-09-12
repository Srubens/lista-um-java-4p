public class Main {

    public static void main(String[] args) {
        float C = 1;
        float K;
        float F;
        float Re;
        float Ra;
        
        F = (float) (C * 1.8) + 32;
        K = (float) (C + 273.15);
        Re = (float) (C * 0.8);
        Ra = (float) (C * 1.8 + 32 + 459.67);
        
        System.out.println("Valor em Kelvin: " + K);
        System.out.println("Valor em Fahrenheit: " + F);
        System.out.println("Valor em Réaumur: " + Re);
        System.out.println("Valor em Rankine: " + Ra);
        
        
    }
    
}
