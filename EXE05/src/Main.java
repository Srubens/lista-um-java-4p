public class Main {

    public static void main(String[] args) {
        
        
        /**
        Produto p = new Produto("bola", "esportes");
        Produto b = new Produto("bola", "entretenimento");
        Produto.getCoutTotal();
        */
        
        Controle c = new Controle();
        c.addCanal();
        c.addCanal();
        c.addCanal();
        c.addCanal();
        
        c.addVolume();
        c.addVolume();
        c.addVolume();
        c.setCanal(0);
        
    }


}
