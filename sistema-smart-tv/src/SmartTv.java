public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    
    
    public void aumentaVoume() { 
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuiVolume() {
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }
    
    public void aumentarCanal() {
        canal++;
        System.out.println("Aumentando o canal para: " + canal);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("Diminuindo o canal para: " + canal);
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Canal atual: " + canal);
    }
}