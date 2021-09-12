public class Produto {
    private String nome;
    private String desc;
    static int total;

    public Produto(String nome, String desc) {
        this.nome = nome;
        this.desc = desc;
        total = total + 1;
    }
    
    static void getCoutTotal(){
        System.out.println(total);
    }
    
}
