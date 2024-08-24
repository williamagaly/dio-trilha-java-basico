public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        
        System.out.println("Volume atual:  " + smartTv.volume);

        smartTv.diminuiVolume();
        smartTv.diminuiVolume();
        smartTv.diminuiVolume();

        System.out.println("Volume atual:  " + smartTv.volume);

        smartTv.aumentaVoume();
        smartTv.aumentaVoume();
        smartTv.aumentaVoume();

        System.out.println("Volume atual:  " + smartTv.volume);

        smartTv.mudarCanal(13);
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Canal atual: " + smartTv.canal);
       
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        System.out.println("Canal atual: " + smartTv.canal);

        System.out.println("Está ligada? " + smartTv.ligada);
        

        smartTv.ligar();
        System.out.println("Ligando a TV " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Desligando a TV " + smartTv.ligada);
        
    }
}
