import java.util.Scanner;
public class PrincipalHilos{
   private static int tamanioVector = 10;
   private static int vector[] = new int[tamanioVector];
   public static void main(String[]Args){
      
      /*Llenado vector*/
      for(int x=0; x<tamanioVector; x++){
         vector[x] = (int)Math.floor(Math.random()*100);
      }//for x
      
      sumaHilos hilos1 = new sumaHilos();
      Thread hilo1 = new Thread(new sumaHilos());
      hilos1.sumaHilos(vector);
      
      cuadradosHilos hilos2 = new cuadradosHilos();
      Thread hilo2 = new Thread(new cuadradosHilos());
      hilos2.cuadradosHilos(vector);

      mediaHilos hilos3 = new mediaHilos();
      Thread hilo3 = new Thread(new mediaHilos());
      hilos3.mediaHilos(vector);
      
      hilo1.start();
      hilo2.start();
      hilo3.start();
      
   }//main
   
   private static int[] vector(){

      return vector;
   }//vector

}//Class PrincipalHielos