public class Controle {
    
    private Televisao televisao;

    public Controle() {
        this.televisao = new Televisao();
    }
    
    public void addCanal(){
        this.televisao.addCanal();
    }
    
    public void addVolume(){
        this.televisao.addVolume();
    }
    
    public int getCanal(){
        return this.televisao.getCanal();
    }
    
    public int getVolume(){
        return this.televisao.getVolume();
    }
    
    public void setCanal(int canal){
        this.televisao.setCanal(canal);
    }
    
    public void subCanal(){
        this.televisao.subCanal();
    }
    
    public void subVolume(){
        this.televisao.addVolume();
    }
    
}
