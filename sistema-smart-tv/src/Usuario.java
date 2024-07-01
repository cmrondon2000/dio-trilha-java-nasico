public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTV smartTv = new SmartTV();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Cual Canal estamos:" + smartTv.canal);

        smartTv.mudarCanal(13);

        System.out.println("Cual Canal estamos:" + smartTv.canal);
        System.out.println("Tv Ligada:?" + smartTv.ligada);

        System.out.println("Tv Ligada:?" + smartTv.ligada);
        System.out.println("Canal Atual ?" + smartTv.canal);
        System.out.println("Volume Atual ?" + smartTv.volume);

        smartTv.ligar();

        System.out.println("Novo Status - : Tv Ligada: ?" + smartTv.ligada);

        smartTv.desligar();

        System.out.println("Novo Status - : Tv Ligada: ?" + smartTv.ligada);

    }
}
