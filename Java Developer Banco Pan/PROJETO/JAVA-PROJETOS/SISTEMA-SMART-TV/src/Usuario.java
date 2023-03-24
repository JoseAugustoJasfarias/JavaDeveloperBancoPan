public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();        
        smartTv.diminuirVolume();        
        smartTv.diminuirVolume();        
        smartTv.aumetarVolume();   
        
        System.out.println("Canal Ligada : "  + SmartTv.canal);

        smartTv.mudarCanal(15);
        System.out.println("Canal Ligada : "  + SmartTv.canal);


        System.out.println("Tv Ligada ? " + SmartTv.ligada);
        System.out.println("Volume Ligada : " + SmartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> Tv Ligada ? " + SmartTv.ligada);

    }

}
