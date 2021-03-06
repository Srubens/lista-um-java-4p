public class Televisao {
    
    private int canal;
    private int volume;
    
    public Televisao(){
        this(0,0);
    }

    public Televisao(int canal, int volume) {
        this.canal = canal;
        this.volume = volume;
    }
    
    public void addCanal(){
        setCanal(getCanal() + 1);
    }
    
    public void addVolume(){
        setVolume(getVolume() + 1);
    }

    public int getCanal() {
        return this.canal;
    }

    public int getVolume() {
        return this.volume;
    }
    
    public void setCanal(int canal){
        if( (canal < 1) || (canal > 500) ){
            canal = 1;
        }
        
        for( int index = canal; index <= 50; index++ ){
            if( ((index % 1) == 0) || ((index % 5) == 0)  ){
                this.canal = index;
                break;
            }
        }
        
        System.out.println("Canal: " + getCanal());
        
    }
    
    private void setVolume(int volume){
        if( (volume >= 0) && (volume <= 50) ){
            this.volume = volume;
        }
        System.out.println("Volume: " + getVolume());
    }
    
    public void subCanal(){
        setCanal(getCanal() - 1);
    }
    
    public void subVolume(){
        setVolume(getCanal() - 1);
    }
    
}
