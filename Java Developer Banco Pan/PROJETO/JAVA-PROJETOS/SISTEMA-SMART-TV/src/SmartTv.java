public class SmartTv {
  
  static boolean ligada = false;
  static int canal = 1;
  static int volume = 25;

  public void mudarCanal (int novoCanl){
    canal = novoCanl;
  }

  public void aumentarCanal (){
    canal ++;
    System.out.println("Aumentando o canal para: " + canal);

  }

  public void diminuirCanal (){
    canal --;
    System.out.println("Aumentando o canal para: " + canal);

  }
  public void aumetarVolume (){
    volume++;
    System.out.println("Aumentando o volume para: " + volume);
  }

  public void diminuirVolume (){
    volume--;
    System.out.println("Diminuindo o volume para: " + volume);

  }


  public void ligar (){
    ligada = true;
  }

  public void desligar (){
    ligada = false;
  }

}